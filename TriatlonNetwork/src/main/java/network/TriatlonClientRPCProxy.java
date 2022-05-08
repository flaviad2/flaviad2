package network;
/*
import domain.*;
import dto.DTOArbitru;
import dto.DTORezultatProba;
import javafx.application.Platform;
//import protobuffprotocol.ProtoUtils;
//import protobuffprotocol.TriatlonProtobufs;
import triatlon.service.IService;
import triatlon.service.Observer;

import java.io.*;
import java.net.Socket;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReadWriteLock;

public class TriatlonClientRPCProxy implements IService {
    private String host;
    private int port;

    private Observer client;

    private InputStream input;
    private OutputStream output;
    private Socket connection;

    private BlockingQueue<TriatlonProtobufs.TriatlonResponse> qresponses;
    private volatile boolean finished;
    public TriatlonClientRPCProxy(String host, int port) {
        this.host = host;
        this.port = port;
        qresponses=new LinkedBlockingQueue<TriatlonProtobufs.TriatlonResponse>();
    }

    @Override
    public Arbitru getArbitruByUsernamePassword(String username, String password,Observer client) throws Exception {
        initializeConnection();
        this.client=client;
        sendRequest(ProtoUtils.loginRequest(username,password));
        TriatlonProtobufs.TriatlonResponse response=readResponse();
        if (response.getType()== TriatlonProtobufs.TriatlonResponse.Type.OK){
            return ProtoUtils.getArbitru(response);
        }

        closeConnection();
        String err=ProtoUtils.getError(response);
        throw new Exception(err);

    }

    @Override
    public Iterable<ParticipantPointsDTO> participantPoints() throws Exception {
        sendRequest(ProtoUtils.participantPointsRequest());
        TriatlonProtobufs.TriatlonResponse response=readResponse();
        if (response.getType()== TriatlonProtobufs.TriatlonResponse.Type.OK){
            return ProtoUtils.getParticipantPointsDTO(response);
        }
        String err=ProtoUtils.getError(response);
        throw new Exception(err);
    }

    @Override
    public Iterable<Participant> participantsNotFromProba(Proba proba) throws Exception {
        sendRequest(ProtoUtils.participantsNotFromProbaRequest(proba));
        TriatlonProtobufs.TriatlonResponse response=readResponse();
        if (response.getType()== TriatlonProtobufs.TriatlonResponse.Type.OK){
            return ProtoUtils.getParticipants(response);
        }
        String err=ProtoUtils.getError(response);
        throw new Exception(err);
    }

    @Override
    public void addRezultat(Rezultat rezultat,Proba proba) throws Exception {
        sendRequest(ProtoUtils.addRezultatRequest(rezultat,proba));
        TriatlonProtobufs.TriatlonResponse response=readResponse();
        if (response.getType()== TriatlonProtobufs.TriatlonResponse.Type.OK){
            return;
        }
        String err=ProtoUtils.getError(response);
        throw new Exception(err);
    }

    @Override
    public Proba getProbaByIdArbitru(Arbitru arbitru) throws Exception {
        sendRequest(ProtoUtils.getProbaByIdArbitruRequest(arbitru));
        TriatlonProtobufs.TriatlonResponse response=readResponse();
        if (response.getType()== TriatlonProtobufs.TriatlonResponse.Type.OK){
            return ProtoUtils.getProba(response);
        }
        String err=ProtoUtils.getError(response);
        throw new Exception(err);
    }

    @Override
    public Iterable<ParticipantPointsDTO> participantsFromProba(Proba proba) throws Exception {
        sendRequest(ProtoUtils.participantsFromProbaRequest(proba));
        TriatlonProtobufs.TriatlonResponse response=readResponse();
        if (response.getType()== TriatlonProtobufs.TriatlonResponse.Type.OK){
            return ProtoUtils.getParticipantPointsDTO(response);
        }
        String err=ProtoUtils.getError(response);
        throw new Exception(err);
    }

    @Override
    public void logout(long id) throws Exception {
        sendRequest(ProtoUtils.logoutRequest(id));
        TriatlonProtobufs.TriatlonResponse response=readResponse();
        closeConnection();
        if (response.getType()== TriatlonProtobufs.TriatlonResponse.Type.OK){
            return;
        }

        closeConnection();
        String err=ProtoUtils.getError(response);
        throw new Exception(err);
    }

    private void closeConnection() {
        finished=true;
        try {
            input.close();
            output.close();
            connection.close();
            client=null;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void sendRequest(TriatlonProtobufs.TriatlonRequest request)throws Exception {
        try {
            request.writeDelimitedTo(output);
            output.flush();
        } catch (IOException e) {
            throw new Exception("Error sending object "+e);
        }

    }

    private TriatlonProtobufs.TriatlonResponse readResponse() throws Exception {
        TriatlonProtobufs.TriatlonResponse response=null;
        try{
            response=qresponses.take();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return response;
    }


    private void initializeConnection() {
        try {
            connection=new Socket(host,port);
            output=connection.getOutputStream();

            input=connection.getInputStream();
            finished=false;
            startReader();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void startReader(){
        Thread tw=new Thread(new ReaderThread());
        tw.start();
    }

    private void handleUpdate(TriatlonProtobufs.TriatlonResponse response){
        if (response.getType()== TriatlonProtobufs.TriatlonResponse.Type.ADDED_POINTS){
            System.out.println("Points added");
            try {
                Iterable<ParticipantPointsDTO> participants=ProtoUtils.getParticipantPointsDTO(response);
                client.notifyAddedPoints(participants);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
//        if (response.type()== ResponseType.RAPORT_ADDED_POINTS){
//            System.out.println("Points added");
//            try {
//                List<ParticipantPointsDTO> participants=(List<ParticipantPointsDTO>) response.data();
//                client.notifyRaportAddedPoints(participants);
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }
//        if (response.type()== ResponseType.PARTICIPANTS_REFRESH){
//            System.out.println("Points added");
//            try {
//                List<Participant> participants=(List<Participant>) response.data();
//                client.notifyParticipantsRefresh(participants);
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }
    }

    private boolean isUpdateResponse(TriatlonProtobufs.TriatlonResponse.Type type){
        return type == TriatlonProtobufs.TriatlonResponse.Type.ADDED_POINTS;
    }

    private class ReaderThread implements Runnable{
        public void run() {
            while(!finished){
                try {
                    TriatlonProtobufs.TriatlonResponse response=TriatlonProtobufs.TriatlonResponse.parseDelimitedFrom(input);
                    System.out.println("response received "+response);
                    if (isUpdateResponse(response.getType())){
                        handleUpdate(response);
                    }else{

                        try {
                            qresponses.put(response);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Reading error "+e);
                }
            }
        }
    }
}
*/



import domain.*;
import dto.DTOArbitru;
import dto.DTORezultatProba;
import javafx.application.Platform;
import triatlon.service.IService;
import triatlon.service.Observer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReadWriteLock;

public class TriatlonClientRPCProxy implements IService {
    private String host;
    private int port;

    private Observer client;

    private ObjectInputStream input;
    private ObjectOutputStream output;
    private Socket connection;

    private BlockingQueue<Response> qresponses;
    private volatile boolean finished;
    public TriatlonClientRPCProxy(String host, int port) {
        this.host = host;
        this.port = port;
        qresponses=new LinkedBlockingQueue<Response>();
    }

    @Override
    public Arbitru getArbitruByUsernamePassword(String username, String password,Observer client) throws Exception {
        System.out.println("aici in proxy get");
        initializeConnection();
        this.client=client;
        DTOArbitru arbitruDTO= new DTOArbitru(username,password);
        Request req=new Request.Builder().type(RequestType.LOGIN).data(arbitruDTO).build();
        System.out.println("S-a facut request-ul de login");

        System.out.println(arbitruDTO.getUsername()+ " " + arbitruDTO.getPassword());
        System.out.println(req.data().toString());
        sendRequest(req);
        System.out.println("S-a trimis requestul de login ");
        Response response=readResponse();

        //raspunsul e null
        System.out.println("S-a primit requestul de login");
        if (response.type()== ResponseType.OK){

            System.out.println("response ok");
            //aici e null
            System.out.println(((Arbitru) response.data()).toString());
            return (Arbitru) response.data();
        }


            String err=response.data().toString();
            closeConnection();

            throw new Exception(err);





    }




    @Override
    public List<ParticipantPointsDTO> participantPoints() throws Exception {
        Request req=new Request.Builder().type(RequestType.GET_ALL_PARTICIPANTS).build();
        sendRequest(req);
        Response response=readResponse();
        if(response.type()==ResponseType.OK){
            return (List<ParticipantPointsDTO>) response.data();
        }
        String err=response.data().toString();
        throw new Exception(err);
    }

    @Override
    public List<Participant> participantsNotFromProba(Proba proba) throws Exception {
        Request req = new Request.Builder().type(RequestType.PARTICIPANTS_NOT_FROM_PROBA).data(proba).build();
        sendRequest(req);
        Response response = readResponse();
        if(response.type()==ResponseType.OK){
            return (List<Participant>) response.data();
        }
        String err=response.data().toString();
        throw new Exception(err);
    }

    @Override
    public void addRezultat(Rezultat rezultat,Proba proba) throws Exception {
        DTORezultatProba dto=new DTORezultatProba(rezultat,proba);
        Request req=new Request.Builder().type(RequestType.ADD_POINTS).data(dto).build();
        sendRequest(req);
        Response response=readResponse();
        if(response.type()==ResponseType.OK){
            return;
        }
        String err=response.data().toString();
        throw new Exception(err);
    }

    @Override
    public Proba getProbaByIdArbitru(Arbitru arbitru) throws Exception {
        Request req=new Request.Builder().type(RequestType.PROBA_BY_ARBITRU).data(arbitru).build();
        sendRequest(req);
        Response response=readResponse();
        if(response.type()==ResponseType.OK){
            return (Proba) response.data();
        }
        String err=response.data().toString();
        throw new Exception(err);
    }

    @Override
    public List<ParticipantPointsDTO> participantsFromProba(Proba proba) throws Exception {
        Request req = new Request.Builder().type(RequestType.PARTICIPANTS_FROM_PROBA).data(proba).build();
        sendRequest(req);
        Response response = readResponse();
        if(response.type()==ResponseType.OK){
            return (List<ParticipantPointsDTO>) response.data();
        }
        String err=response.data().toString();
        throw new Exception(err);
    }

    @Override
    public void logout(long id) throws Exception {
        Request req=new Request.Builder().type(RequestType.LOGOUT).data(id).build();
        sendRequest(req);
        Response response=readResponse();
        closeConnection();
        if (response.type()== ResponseType.OK){
            return;
        }

        closeConnection();
        String err=response.data().toString();
        throw new Exception(err);
    }

    private void closeConnection() {
        finished=true;
        try {
            input.close();
            output.close();
            connection.close();
            client=null;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void sendRequest(Request request)throws Exception {
        try {
            System.out.println("ACESTA ESTE OUTPUT");
            System.out.println(output);
            output.writeObject(request);

            output.flush();
        } catch (IOException e) {
            throw new Exception("Error sending object "+e);
        }

    }

    private Response readResponse() throws Exception {
        Response response=null;
        try{
            response=qresponses.take();


        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        return response;
    }


    private void initializeConnection() {
        try {
            connection=new Socket(host,port);
            output=new ObjectOutputStream(connection.getOutputStream());
            System.out.println("ACESTA ESTE OUTPUT \n");
            System.out.println(output);
            output.flush();
            input=new ObjectInputStream(connection.getInputStream());
            finished=false;
            startReader();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void startReader(){
        Thread tw=new Thread(new ReaderThread());
        tw.start();
    }

    private void handleUpdate(Response response){
        if (response.type()== ResponseType.ADDED_POINTS){
            System.out.println("Points added");
            try {
                List<ParticipantPointsDTO> participants=(List<ParticipantPointsDTO>) response.data();
                client.notifyAddedPoints(participants);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
//
    }

    private boolean isUpdate(Response response){
        return response.type()== ResponseType.ADDED_POINTS;
    }

    private class ReaderThread implements Runnable{
        public void run() {
            while(!finished){
                try {
                    Object response=input.readObject();
                    System.out.println("response received "+response);
                    if (isUpdate((Response)response)){
                        Platform.runLater(()->handleUpdate((Response)response));
                    }else{

                        try {
                            qresponses.put((Response)response);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println("Reading error "+e);
                }
            }
        }
    }
}
