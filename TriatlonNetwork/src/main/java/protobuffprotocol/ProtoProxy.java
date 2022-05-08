package protobuffprotocol;



import domain.*;
import dto.DTOArbitru;
import dto.DTORezultatProba;
import javafx.application.Platform;
import triatlon.service.IService;
import triatlon.service.Observer;

import java.io.*;
import java.net.Socket;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ProtoProxy implements IService {
    private String host;
    private int port;

    private Observer client;

    private InputStream input;
    private OutputStream output;
    private Socket connection;

    private BlockingQueue<TriatlonProtobufs.TriatlonResponse> qresponses;
    private volatile boolean finished;

    public ProtoProxy(String host, int port) {
        this.host = host;
        this.port = port;
        qresponses=new LinkedBlockingQueue<TriatlonProtobufs.TriatlonResponse>();
    }

    @Override
    public Arbitru getArbitruByUsernamePassword(String username, String password,Observer client) throws Exception {
        initializeConnection();
        this.client=client;
        DTOArbitru arbitruDTO= new DTOArbitru(username,password);
        //Request req=new Request.Builder().type(RequestType.LOGIN).data(arbitruDTO).build();
        sendRequest(ProtoUtils.loginRequest(arbitruDTO.getUsername(), arbitruDTO.getPassword()));
        //  System.out.println(arbitruDTO.getUsername()+ " " + arbitruDTO.getPassword());
        // System.out.println(req.data().toString());

        TriatlonProtobufs.TriatlonResponse response = readResponse();

        if (response.getType()== TriatlonProtobufs.TriatlonResponse.Type.OK){


           // return (Arbitru) response.getArbitruOrBuilder();
            //?
            return ProtoUtils.getArbitru(response);

        }
        else {
            String err = ProtoUtils.getError(response);

            //String err=response.data().toString();
            closeConnection(); //?? close

            throw new Exception(err);
        }




    }




    @Override
    public List<ParticipantPointsDTO> participantPoints() throws Exception {
        /*Request req=new Request.Builder().type(RequestType.GET_ALL_PARTICIPANTS).build();
        sendRequest(req);
        Response response=readResponse();
        if(response.type()==ResponseType.OK){
            return (List<ParticipantPointsDTO>) response.data();
        }
        String err=response.data().toString();
        throw new Exception(err);
        return null; */

         //Request req=new Request.Builder().type(RequestType.GET_ALL_PARTICIPANTS).build();
        //sendRequest(req);
        sendRequest(ProtoUtils.participantPointsRequest());
        TriatlonProtobufs.TriatlonResponse response=readResponse();
        if(response.getType()== TriatlonProtobufs.TriatlonResponse.Type.OK){
            return (List<ParticipantPointsDTO>) ProtoUtils.getParticipantPointsDTO(response);
        }
        String err=response.getAllFields().toString();
        throw new Exception(err);


    }

    @Override
    public List<Participant> participantsNotFromProba(Proba proba) throws Exception {
        /*Request req = new Request.Builder().type(RequestType.PARTICIPANTS_NOT_FROM_PROBA).data(proba).build();
        sendRequest(req);
        Response response = readResponse();
        if(response.type()==ResponseType.OK){
            return (List<Participant>) response.data();
        }
        String err=response.data().toString();
        throw new Exception(err); */

        sendRequest(ProtoUtils.participantsNotFromProbaRequest(proba));
        TriatlonProtobufs.TriatlonResponse response=readResponse();
        if(response.getType()== TriatlonProtobufs.TriatlonResponse.Type.OK){
            List<Participant> result =
                    StreamSupport.stream(ProtoUtils.getParticipants(response).spliterator(), false)
                            .collect(Collectors.toList());
            return  result;
        }
        String err=response.getAllFields().toString();
        throw new Exception(err);
    }

    @Override
    public void addRezultat(Rezultat rezultat,Proba proba) throws Exception {
       /* DTORezultatProba dto=new DTORezultatProba(rezultat,proba);
        Request req=new Request.Builder().type(RequestType.ADD_POINTS).data(dto).build();
        sendRequest(req);
        Response response=readResponse();
        if(response.type()==ResponseType.OK){
            return;
        }
        String err=response.data().toString();
        throw new Exception(err);  */
        DTORezultatProba dto=new DTORezultatProba(rezultat,proba);
        sendRequest(ProtoUtils.addRezultatRequest(rezultat, proba));
        TriatlonProtobufs.TriatlonResponse response = readResponse();
        if(response.getType()== TriatlonProtobufs.TriatlonResponse.Type.OK)
            return;
        String err= response.getAllFields().toString();
        throw new Exception(err);

    }

    @Override
    public Proba getProbaByIdArbitru(Arbitru arbitru) throws Exception {
        System.out.println("aici nu e bn _______________________1");
        /*
        Request req=new Request.Builder().type(RequestType.PROBA_BY_ARBITRU).data(arbitru).build();
        sendRequest(req);
        Response response=readResponse();
        if(response.type()==ResponseType.OK){
            return (Proba) response.data();
        }
        String err=response.data().toString();
        throw new Exception(err); */
        sendRequest(ProtoUtils.getProbaByIdArbitruRequest(arbitru));
        TriatlonProtobufs.TriatlonResponse response = readResponse();
        if(response.getType() == TriatlonProtobufs.TriatlonResponse.Type.OK)
            return ProtoUtils.getProba(response);
        String err = ProtoUtils.getError(response);
        throw new Exception(err);
    }

    @Override
    public List<ParticipantPointsDTO> participantsFromProba(Proba proba) throws Exception {
        System.out.println("aici nu e bn _______________________2");

        /*
        Request req = new Request.Builder().type(RequestType.PARTICIPANTS_FROM_PROBA).data(proba).build();
        sendRequest(req);
        Response response = readResponse();
        if(response.type()==ResponseType.OK){
            return (List<ParticipantPointsDTO>) response.data();
        }
        String err=response.data().toString();
        throw new Exception(err);

         */

        sendRequest(ProtoUtils.participantsFromProbaRequest(proba));

        TriatlonProtobufs.TriatlonResponse response=readResponse();
        if(response.getType()== TriatlonProtobufs.TriatlonResponse.Type.OK){
            List<ParticipantPointsDTO> result =
                    StreamSupport.stream(ProtoUtils.getParticipantPointsDTO(response).spliterator(), false)
                            .collect(Collectors.toList());
            return  result;
        }
        String err=response.getAllFields().toString();
        throw new Exception(err);
    }

    @Override
    public void logout(long id) throws Exception {
       // Request req=new Request.Builder().type(RequestType.LOGOUT).data(id).build();
       // sendRequest(req);
        sendRequest(ProtoUtils.logoutRequest(id));
        TriatlonProtobufs.TriatlonResponse response=readResponse();
        closeConnection();
        if (response.getType()== TriatlonProtobufs.TriatlonResponse.Type.OK){
            return;
        }

        closeConnection();
        String err=response.getAllFields().toString();
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
            System.out.println("Sending request ... ");
            request.writeDelimitedTo(output);
            output.flush();
            System.out.println("request sent");
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


    private void initializeConnection() throws Exception {
        try {
            connection=new Socket(host,port);
            output= connection.getOutputStream();
            //output.flush();
            input= connection.getInputStream();     //new ObjectInputStream(connection.getInputStream());
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
                System.out.println("Aici incearca update??? ");
               // List<ParticipantPointsDTO> participants=(List<ParticipantPointsDTO>) ProtoUtils.

                        List<ParticipantPointsDTO> result =
                        StreamSupport.stream(ProtoUtils.getParticipantPointsDTO(response).spliterator(), false)
                                .collect(Collectors.toList());
                client.notifyAddedPoints(result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
//
    }

    private boolean isUpdate(TriatlonProtobufs.TriatlonResponse.Type type){
        switch (type){
            case ADDED_POINTS: return true;
        }
        return false;
    }

    private class ReaderThread implements Runnable{
        public void run() {
            while(!finished){
                try {
                    TriatlonProtobufs.TriatlonResponse response=TriatlonProtobufs.TriatlonResponse.parseDelimitedFrom(input);
                    System.out.println("response received "+response);
                    if (isUpdate(response.getType())){
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
