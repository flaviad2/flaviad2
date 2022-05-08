package triatlon.service;

import domain.Participant;
import domain.ParticipantPointsDTO;

import java.util.List;

public interface Observer {
     void notifyAddedPoints(Iterable<ParticipantPointsDTO> participants) throws Exception;
//     void notifyRaportAddedPoints(List<ParticipantPointsDTO> participants) throws Exception;
//     void notifyParticipantsRefresh(List<Participant> participants) throws Exception;
}
