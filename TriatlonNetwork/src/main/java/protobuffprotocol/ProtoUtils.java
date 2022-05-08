package protobuffprotocol;

import domain.*;
import dto.DTOArbitru;

import java.util.ArrayList;
import java.util.List;


public class ProtoUtils {
    //REQUEST
    public static TriatlonProtobufs.TriatlonRequest loginRequest(String username, String password) {
        TriatlonProtobufs.DTOArbitruProto arbitruDTO = TriatlonProtobufs.DTOArbitruProto.newBuilder()
                .setUsername(username)
                .setPassword(password)
                .build();
        return TriatlonProtobufs.TriatlonRequest.newBuilder()
                .setType(TriatlonProtobufs.TriatlonRequest.Type.LOGIN)
                .setArbitruDTO(arbitruDTO)
                .build();
    }

    public static TriatlonProtobufs.TriatlonRequest logoutRequest(Long id) {
        TriatlonProtobufs.ID idReq = TriatlonProtobufs.ID.newBuilder()
                .setId(id)
                .build();
        return TriatlonProtobufs.TriatlonRequest.newBuilder()
                .setType(TriatlonProtobufs.TriatlonRequest.Type.LOGOUT)
                .setId(idReq)
                .build();
    }

    public static TriatlonProtobufs.TriatlonRequest addRezultatRequest(Rezultat rezultatParam, Proba probaParam) {
        Proba proba = rezultatParam.getProba();
        Arbitru arb = proba.getArbitru();
        Participant participant = rezultatParam.getParticipant();

        TriatlonProtobufs.ArbitruProto arbitruProbaRezProto = TriatlonProtobufs.ArbitruProto.newBuilder()
                .setId(arb.getId())
                .setName(arb.getName())
                .setUsername(arb.getUsername())
                .setPasword(arb.getPassword())
                .build();
        TriatlonProtobufs.ProbaProto probaRezProto = TriatlonProtobufs.ProbaProto.newBuilder()
                .setId(proba.getId())
                .setArbitru(arbitruProbaRezProto)
                .setDiscipline(proba.getDiscipline())
                .build();
        TriatlonProtobufs.ParticipantProto participantRezProto = TriatlonProtobufs.ParticipantProto.newBuilder()
                .setId(participant.getId())
                .setFirstName(participant.getFirstName())
                .setLastName(participant.getLastName())
                .build();
        TriatlonProtobufs.RezultatProto rezultatProto = TriatlonProtobufs.RezultatProto.newBuilder()
//                .setId(rezultatParam.getId())
                .setParticipant(participantRezProto)
                .setProba(probaRezProto)
                .setPoints(rezultatParam.getPoints())
                .build();

        Arbitru arb2 = probaParam.getArbitru();
        TriatlonProtobufs.ArbitruProto arbitruProbaProto = TriatlonProtobufs.ArbitruProto.newBuilder()
                .setId(arb2.getId())
                .setName(arb2.getName())
                .setUsername(arb2.getUsername())
                .setPasword(arb2.getPassword())
                .build();
        TriatlonProtobufs.ProbaProto probaProto = TriatlonProtobufs.ProbaProto.newBuilder()
                .setId(probaParam.getId())
                .setArbitru(arbitruProbaProto)
                .setDiscipline(probaParam.getDiscipline())
                .build();

        TriatlonProtobufs.DTORezultatProbaProto rezultatReq = TriatlonProtobufs.DTORezultatProbaProto.newBuilder()
                .setProba(probaProto)
                .setRezultat(rezultatProto)
                .build();

        return TriatlonProtobufs.TriatlonRequest.newBuilder()
                .setType(TriatlonProtobufs.TriatlonRequest.Type.ADD_POINTS)
                .setRezultatProbaDTO(rezultatReq)
                .build();
    }

    public static TriatlonProtobufs.TriatlonRequest getProbaByIdArbitruRequest(Arbitru arbitru) {
        TriatlonProtobufs.ArbitruProto arbitruReq = TriatlonProtobufs.ArbitruProto.newBuilder()
                .setId(arbitru.getId())
                .setName(arbitru.getName())
                .setUsername(arbitru.getUsername())
                .setPasword(arbitru.getPassword())
                .build();

        return TriatlonProtobufs.TriatlonRequest.newBuilder()
                .setType(TriatlonProtobufs.TriatlonRequest.Type.PROBA_BY_ARBITRU)
                .setArbitru(arbitruReq)
                .build();
    }

    public static TriatlonProtobufs.TriatlonRequest participantsFromProbaRequest(Proba proba) {
        Arbitru arb = proba.getArbitru();

        TriatlonProtobufs.ArbitruProto arbitruProbaProto = TriatlonProtobufs.ArbitruProto.newBuilder()
                .setId(arb.getId())
                .setName(arb.getName())
                .setUsername(arb.getUsername())
                .setPasword(arb.getPassword())
                .build();
        TriatlonProtobufs.ProbaProto probaProtoReq = TriatlonProtobufs.ProbaProto.newBuilder()
                .setId(proba.getId())
                .setArbitru(arbitruProbaProto)
                .setDiscipline(proba.getDiscipline())
                .build();

        return TriatlonProtobufs.TriatlonRequest.newBuilder()
                .setType(TriatlonProtobufs.TriatlonRequest.Type.PARTICIPANTS_FROM_PROBA)
                .setProba(probaProtoReq)
                .build();
    }

    public static TriatlonProtobufs.TriatlonRequest participantsNotFromProbaRequest(Proba proba) {
        Arbitru arb = proba.getArbitru();

        TriatlonProtobufs.ArbitruProto arbitruProbaProto = TriatlonProtobufs.ArbitruProto.newBuilder()
                .setId(arb.getId())
                .setName(arb.getName())
                .setUsername(arb.getUsername())
                .setPasword(arb.getPassword())
                .build();
        TriatlonProtobufs.ProbaProto probaProtoReq = TriatlonProtobufs.ProbaProto.newBuilder()
                .setId(proba.getId())
                .setArbitru(arbitruProbaProto)
                .setDiscipline(proba.getDiscipline())
                .build();

        return TriatlonProtobufs.TriatlonRequest.newBuilder()
                .setType(TriatlonProtobufs.TriatlonRequest.Type.PARTICIPANTS_NOT_FROM_PROBA)
                .setProba(probaProtoReq)
                .build();
    }

    public static TriatlonProtobufs.TriatlonRequest participantPointsRequest() {
        return TriatlonProtobufs.TriatlonRequest.newBuilder()
                .setType(TriatlonProtobufs.TriatlonRequest.Type.GET_ALL_PARTICIPANTS)
                .build();
    }
    //RESPONSE

    public static String getError(TriatlonProtobufs.TriatlonResponse response) {
        return response.getError();
    }

    public static Arbitru getArbitru(TriatlonProtobufs.TriatlonResponse response) {
        Arbitru arbitru = new Arbitru(response.getArbitru().getUsername(), response.getArbitru().getPasword(), response.getArbitru().getName());
        arbitru.setId(response.getArbitru().getId());
        return arbitru;
    }

    public static Arbitru getArbitru(TriatlonProtobufs.TriatlonRequest request) {
        Arbitru arbitru = new Arbitru(request.getArbitru().getUsername(), request.getArbitru().getPasword(), request.getArbitru().getName());
        arbitru.setId(request.getArbitru().getId());
        return arbitru;
    }

/*
    public static TriatlonProtobufs.TriatlonRequest createGetArbitruRequest(DTOArbitru user){
        TriatlonProtobufs.DTOArbitruProto userDTO=TriatlonProtobufs.DTOArbitruProto.newBuilder().setUsername(user.getUsername()).setPassword(user.getPassword()).build();
        TriatlonProtobufs.TriatlonRequest request= TriatlonProtobufs.TriatlonRequest.newBuilder().setType(TriatlonProtobufs.TriatlonRequest.Type.GetAngajat)
                .setUser(userDTO).build();
        return request;
    }


 */
    public static Proba getProba(TriatlonProtobufs.TriatlonResponse response) {
        Arbitru arbitru = new Arbitru(response.getProba().getArbitru().getUsername(), response.getProba().getArbitru().getPasword(), response.getProba().getArbitru().getName());
        arbitru.setId(response.getProba().getArbitru().getId());
        Proba proba = new Proba(response.getProba().getDiscipline(), arbitru);
        proba.setId(response.getProba().getId());
        return proba;
    }

    public static Iterable<ParticipantPointsDTO> getParticipantPointsDTO(TriatlonProtobufs.TriatlonResponse response) {
        List<ParticipantPointsDTO> list = new ArrayList<ParticipantPointsDTO>();
        for (int i = 0; i < response.getParticipantsCount(); i++) {
            TriatlonProtobufs.ParticipantPointsDTOProto participantPointsDTOProto = response.getParticipants(i);
            Participant participant = new Participant(participantPointsDTOProto.getParticipant().getFirstName(), participantPointsDTOProto.getParticipant().getLastName());
            participant.setId(participantPointsDTOProto.getParticipant().getId());
            ParticipantPointsDTO participantPointsDTO = new ParticipantPointsDTO(participant, participantPointsDTOProto.getPoints());
            participantPointsDTO.setId(participantPointsDTO.getId());
            list.add(participantPointsDTO);
        }
        return list;
    }

    public static Iterable<Participant> getParticipants(TriatlonProtobufs.TriatlonResponse response) {
        List<Participant> list = new ArrayList<Participant>();
        for (int i = 0; i < response.getParticipantsNotFromProbaCount(); i++) {
            TriatlonProtobufs.ParticipantProto participantPointsDTOProto = response.getParticipantsNotFromProba(i);
            Participant participant = new Participant(participantPointsDTOProto.getFirstName(), participantPointsDTOProto.getLastName());
            participant.setId(participantPointsDTOProto.getId());
            list.add(participant);
        }
        return list;
    }

    public static TriatlonProtobufs.TriatlonResponse createOkResponse()
    {
        TriatlonProtobufs.TriatlonResponse response = TriatlonProtobufs.TriatlonResponse.newBuilder().setType(TriatlonProtobufs.TriatlonResponse.Type.OK).build();
        return response;
    }

    public static TriatlonProtobufs.TriatlonResponse createErrorResponse(String text)
    {
        TriatlonProtobufs.TriatlonResponse response = TriatlonProtobufs.TriatlonResponse.newBuilder().
                setType(TriatlonProtobufs.TriatlonResponse.Type.ERROR).
                setError(text).build();
        return response;
    }



}
