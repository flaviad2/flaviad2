package repository;

import domain.Arbitru;
import domain.Participant;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IRepositoryArbitru extends IRepository<Long,Arbitru> {

    public Arbitru getArbitruByUsernamePassword(String username,String password);
}
