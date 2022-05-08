package triatlon.service;

import domain.*;

import java.util.List;

public interface IService {
    public Arbitru getArbitruByUsernamePassword(String username, String password,Observer client) throws Exception;
    public Iterable<ParticipantPointsDTO> participantPoints() throws Exception;
    public Iterable<Participant> participantsNotFromProba(Proba p) throws Exception;
    public void addRezultat(Rezultat rezultat,Proba proba) throws Exception;
    public Proba getProbaByIdArbitru(Arbitru arbitru) throws Exception;
    public Iterable<ParticipantPointsDTO> participantsFromProba(Proba proba) throws Exception;
    public void logout(long id) throws Exception;
}
