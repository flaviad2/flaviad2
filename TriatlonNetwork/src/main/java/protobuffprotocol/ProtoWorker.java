package protobuffprotocol;

import domain.*;
import dto.DTOArbitru;
import dto.DTORezultatProba;
import org.apache.logging.log4j.core.tools.picocli.CommandLine;
import triatlon.service.IService;
import triatlon.service.Observer;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class ProtoWorker implements Runnable, Observer {
    private IService server;
    private Socket connection;

    private InputStream input;
    private OutputStream output;
    private volatile boolean connected;
    public ProtoWorker(IService server, Socket connection) {
        this.server = server;
        this.connection = connection;
        try{
            output=connection.getOutputStream();
           // output.flush();
            input=connection.getInputStream();
            connected=true;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void run() {
        while(connected){
            try {
                //Object request=input.readObject();
                System.out.println("Waiting requests ...");

                System.out.println("Acesta e input --------------");
                System.out.println(input.toString());
                TriatlonProtobufs.TriatlonRequest request=TriatlonProtobufs.TriatlonRequest.parseDelimitedFrom(input);
                //


                System.out.println("Request received: "+request.getType());

                TriatlonProtobufs.TriatlonResponse response= handleRequest(request);


                if (response!=null){
                    sendResponse(response);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            input.close();
            output.close();
            connection.close();
        } catch (IOException e) {
            System.out.println("Error "+e);
        }
    }

   // private static Response okResponse=new Response.Builder().type(ResponseType.OK).build();

    private TriatlonProtobufs.TriatlonResponse handleRequest(TriatlonProtobufs.TriatlonRequest request){
        TriatlonProtobufs.TriatlonResponse response=null;
        if (request.getType()== TriatlonProtobufs.TriatlonRequest.Type.LOGIN){
            System.out.println("Login request ..."+request.getType());
            //DTOArbitru arbitruDTO=(DTOArbitru) request.data();
            DTOArbitru arbitruDTO = new DTOArbitru( ProtoUtils.getArbitru(request).getUsername(), ProtoUtils.getArbitru(request).getPassword());
            try {
                Arbitru voluntar=server.getArbitruByUsernamePassword(arbitruDTO.getUsername(), arbitruDTO.getPassword(),this);
                System.out.println("raspuns ok");
                return ProtoUtils.createOkResponse();
               // response = new Response.Builder().type(ResponseType.OK).data(voluntar).build();
            } catch (Exception e) {
                connected=false;
                return ProtoUtils.createErrorResponse(e.getMessage());
            }
        }
        if(request.getType()== TriatlonProtobufs.TriatlonRequest.Type.GET_ALL_PARTICIPANTS){
            System.out.println("GetAllParticipantsPoints request..."+request.getType());
            try{
                Iterable<ParticipantPointsDTO> participants=server.participantPoints();
               return ProtoUtils.createOkResponse();
                // response=new Response.Builder().type(ResponseType.OK).data(participants).build();
            } catch (Exception e) {
                return ProtoUtils.createErrorResponse(e.getMessage());

                //response=new Response.Builder().type(ResponseType.ERROR).data(e.getMessage()).build();
            }
        }
        /*
        if(request.getType()==TriatlonProtobufs.TriatlonRequest.Type.PROBA_BY_ARBITRU){
            System.out.println("ProbaByIdArbitru request..."+request.getType());
            TriatlonProtobufs.ArbitruProto arbitru=request.getArbitru();
            try{
                Arbitru a = server.get
                Proba proba=server.getProbaByIdArbitru(arbitru);
                response=new Response.Builder().type(ResponseType.OK).data(proba).build();

            } catch (Exception e) {
                response=new Response.Builder().type(ResponseType.ERROR).data(e.getMessage()).build();
            }
        }
        if(request.type()==RequestType.PARTICIPANTS_NOT_FROM_PROBA){
            System.out.println("ParticipantsNotFromProba request..."+request.type());
            Proba proba= (Proba) request.data();
            try{
                Iterable<Participant> participants= server.participantsNotFromProba(proba);
                response=new Response.Builder().type(ResponseType.OK).data(participants).build();

            } catch (Exception e) {
                response=new Response.Builder().type(ResponseType.ERROR).data(e.getMessage()).build();
            }
        }
        if(request.type()==RequestType.PARTICIPANTS_FROM_PROBA){
            System.out.println("ParticipantsFromProba request..."+request.type());
            Proba proba= (Proba) request.data();
            try{
                Iterable<ParticipantPointsDTO> participants= server.participantsFromProba(proba);
                response=new Response.Builder().type(ResponseType.OK).data(participants).build();

            } catch (Exception e) {
                response=new Response.Builder().type(ResponseType.ERROR).data(e.getMessage()).build();
            }
        }


        if(request.type()==RequestType.ADD_POINTS){
            System.out.println("AddPoints request..."+request.type());
            DTORezultatProba dto= (DTORezultatProba) request.data();
            try{
                server.addRezultat(dto.getRezultat(),dto.getProba());
                response=new Response.Builder().type(ResponseType.OK).build();

            } catch (Exception e) {
                response=new Response.Builder().type(ResponseType.ERROR).data(e.getMessage()).build();
            }
        }

         */
        if (request.getType()== TriatlonProtobufs.TriatlonRequest.Type.LOGOUT){
            System.out.println("Log_Out Request ..."+request.getType());
           // Long id=(Long) request.data();
            Arbitru arbitru = ProtoUtils.getArbitru(request);
            try {
                server.logout(arbitru.getId());
                connected=false;
                return ProtoUtils.createOkResponse();
                //response = new Response.Builder().type(ResponseType.OK).build();
            } catch (Exception e) {
                return ProtoUtils.createErrorResponse(e.getMessage());
                //response = new Response.Builder().type(ResponseType.ERROR).data(e.getMessage()).build();
            }
        }
        return response;
    }

    private void sendResponse(TriatlonProtobufs.TriatlonResponse response) throws IOException{
        System.out.println("sending response "+response);
        //output.writeObject(response);
        response.writeDelimitedTo(output);
        output.flush();
    }

    @Override
    public void notifyAddedPoints(Iterable<ParticipantPointsDTO> participants) {
        try{
           // TriatlonProtobufs.TriatlonResponse response =
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
//    public void notifyRaportAddedPoints(List<ParticipantPointsDTO> participants) {
//        try{
//            Response response = new Response.Builder().type(ResponseType.RAPORT_ADDED_POINTS).data(participants).build();
//            sendResponse(response);
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }
//    public void notifyParticipantsRefresh(List<Participant> participants) {
//        try{
//            Response response = new Response.Builder().type(ResponseType.PARTICIPANTS_REFRESH).data(participants).build();
//            sendResponse(response);
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }
}
