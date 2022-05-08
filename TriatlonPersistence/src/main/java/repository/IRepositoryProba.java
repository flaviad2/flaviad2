package repository;

import domain.Arbitru;
import domain.Participant;
import domain.Proba;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IRepositoryProba extends IRepository<Long, Proba> {
    public Proba getProbaByIdArbitru(Arbitru arbitru);
}
