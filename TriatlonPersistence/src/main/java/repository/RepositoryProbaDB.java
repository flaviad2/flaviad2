package repository;
import domain.Arbitru;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import domain.Participant;
import domain.Proba;
import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class RepositoryProbaDB implements IRepositoryProba{

    private JdbcUtils dbUtils;
    private static final Logger logger= LogManager.getLogger();
    private IRepositoryArbitru repoArbitru;

    public RepositoryProbaDB(Properties props,IRepositoryArbitru repoArbitru) {
        logger.info("Initializing RepositoryProbaDB with properties: {} ",props);
        this.dbUtils = new JdbcUtils(props);
        this.repoArbitru=repoArbitru;
    }

    @Override
    public void add(Proba elem) {
        logger.traceEntry("add task {} ",elem);
        Connection con= dbUtils.getConnection();
        try(PreparedStatement preSmt=con.prepareStatement("insert into Probe (id,discipline,id_arbitru) values (?,?,?)")){
            preSmt.setLong(1,generateID());
            preSmt.setString(2,elem.getDiscipline());
            preSmt.setLong(3,elem.getArbitru().getId());
            int result=preSmt.executeUpdate();
            logger.trace("added {} instances",result);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        logger.traceExit();
    }

    @Override
    public void delete(Long aLong) {
        logger.traceEntry("deleting task {} ",aLong);
        Connection con= dbUtils.getConnection();
        try(PreparedStatement preSmt=con.prepareStatement("DELETE from Probe WHERE id = ?;")){
            preSmt.setLong(1,aLong);
            int result=preSmt.executeUpdate();
            logger.trace("Deleted {} instances",result);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        logger.traceExit();
    }

    @Override
    public void update(Proba elem, Long aLong) {
        logger.traceEntry("updating task {} ",elem);
        Connection con= dbUtils.getConnection();
        try(PreparedStatement preSmt=con.prepareStatement("UPDATE Probe SET discipline =?,id_arbitru=? WHERE id = ?;")){
            preSmt.setString(1,elem.getDiscipline());
            preSmt.setLong(2,elem.getArbitru().getId());
            preSmt.setLong(3,aLong);
            int result=preSmt.executeUpdate();
            logger.trace("Saved {} instances",result);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        logger.traceExit();
    }

    @Override
    public Proba findOne(Long aLong) {
        logger.traceEntry();
        Connection con=dbUtils.getConnection();
        Proba proba =null;
        try(PreparedStatement preSmt=con.prepareStatement("select * from Probe where id=?")){
            preSmt.setLong(1,aLong);
            ResultSet result=preSmt.executeQuery();
            if(result.next()){
                proba=extractEntity(result);
            }
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        logger.traceExit();
        return proba;
    }

    @Override
    public Iterable<Proba> findAll() {
        logger.traceEntry();
        Connection con=dbUtils.getConnection();
        List<Proba> probe =new ArrayList<>();
        try(PreparedStatement preSmt=con.prepareStatement("select * from Probe")){
            try(ResultSet result=preSmt.executeQuery()){
                while(result.next()){
                    Proba a=extractEntity(result);
                    probe.add(a);
                }
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        logger.traceExit();
        return probe;
    }

    @Override
    public Long generateID(){
        logger.traceEntry();
        Connection con=dbUtils.getConnection();
        Long id=0L;
        try(PreparedStatement preSmt=con.prepareStatement("select * from Probe")){
            try(ResultSet result=preSmt.executeQuery()){
                while(result.next()){
                    Long idResult= result.getLong("id");
                    if(idResult>id) id=idResult;
                }
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        logger.traceExit();
        return id+1;
    }
    @Override
    public Proba extractEntity(ResultSet resultSet) throws SQLException{
        Long id = resultSet.getLong("id");
        String discipline = resultSet.getString("discipline");
        Long idArbitru =resultSet.getLong("id_arbitru");

        Arbitru arbitru=repoArbitru.findOne(idArbitru);
        Proba p = new Proba(discipline,arbitru);
        p.setId(id);
        return p;
    }

    @Override
    public Proba getProbaByIdArbitru(Arbitru arbitru) {
        logger.traceEntry();
        Connection con=dbUtils.getConnection();
        Proba proba =null;
        try(PreparedStatement preSmt=con.prepareStatement("select * from Probe where id_arbitru=?")){
            preSmt.setLong(1,arbitru.getId());
            ResultSet result=preSmt.executeQuery();
            if(result.next()){
                proba=extractEntity(result);
            }
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        logger.traceExit();
        return proba;
    }
}
