package repository;

import domain.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

public interface IRepositoryRezultat extends IRepository<Long, Rezultat> {

    //public Float pointsParticipant(Participant Participant);
    public List<ParticipantPointsDTO> pointsParticipant();
    public List<Participant> participantsNotFromProba(Proba Proba);
    public List<ParticipantPointsDTO> participantsFromProba(Proba Proba);
}
