package repository;


import domain.Arbitru;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.Transaction;
import utils.JdbcUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.stream.StreamSupport;

public class RepositoryArbitruDBhibernate implements IRepositoryArbitru{
     static SessionFactory sessionFactory;

    private JdbcUtils dbUtils;

    public RepositoryArbitruDBhibernate() {
      //  logger.info("Initializing RepositoryArbitruDB with properties: {} ",props);
      //  this.dbUtils = new JdbcUtils(props);
        System.out.println("Ajunge in constructorul hibernate");

    }
    static void initialize() {
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
        }
        catch (Exception e) {
            System.err.println("Exceptie "+e);
            StandardServiceRegistryBuilder.destroy( registry );
        }
    }

    static void close() {
        if ( sessionFactory != null ) {
            sessionFactory.close();
        }
    }
    @Override
    public void add(Arbitru elem) {
        initialize();

        try(Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(elem);
            session.getTransaction().commit();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            close();
        }

    }

    //@Override
    public void delete1(Long aLong) {
        initialize();

        try(Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.delete(aLong);
            session.getTransaction().commit();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            close();
        }
    }





    @Override
    public void delete(Long aLong) {

        initialize();
        try(Session session = sessionFactory.openSession())
        {
            Transaction tx = null;
            try {
                tx = session.beginTransaction();
                Arbitru crit = session.createQuery("from Arbitru where id=:aLong", Arbitru.class).setParameter("aLong", aLong).setMaxResults(1).uniqueResult();

                System.out.println("stergem arbitrul " + crit.getId());
                session.delete(crit);
                tx.commit();
                close();
            }
            catch(RuntimeException ex)
            {
                System.err.println("Eroare la stergere "+ex);
                if (tx != null)
                    tx.rollback();
            }
        }



    }

    @Override
    public void update(Arbitru elem, Long aLong) {
        initialize();

        try(Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(elem);
            session.getTransaction().commit();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            close();
        }
    }

    @Override
    public Arbitru extractEntity(ResultSet resultSet) throws SQLException {
        return null;
    }

    @Override
    public Long generateID() {
        return null;
    }

    @Override
    public Arbitru findOne(Long aLong) {
        initialize();
        System.out.println("In find one din hibernate");
        try(Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            System.out.println("In find one din hibernate, a inceput transactia");

            Query query=session.createQuery("from Arbitru where id = :aLong");
            query.setParameter("aLong", aLong);
            Arbitru arbitru=(Arbitru)query.uniqueResult();
            System.out.println("In find one din hibernate, am gasit arbitrul ");
            System.out.println(arbitru.toString());

            session.getTransaction().commit();

            System.out.println("In find one din hibernate, s-a comis si inchidem");

            close();
            return arbitru;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            close();
        }
        return null;
    }

    @Override
    public Iterable<Arbitru> findAll() {
        initialize();

        try(Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Query query=session.createQuery("from Arbitru");

            Iterable<Arbitru> arbitrii=(Iterable<Arbitru>)query.uniqueResult();


            session.getTransaction().commit();
            close();
            return arbitrii;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            close();
        }
        return null;
    }

    @Override
    public Arbitru getArbitruByUsernamePassword(String username, String password) {
        System.out.println("aicccccccccccci");
        initialize();
        System.out.println("in get arbitru by username");

        try(Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            System.out.println("------in get arbitru by username, a inceput transactia---"); //ok


/*
            Query query=session.createQuery("from Arbitru where username=:username and password=:password");





            query.setParameter("username",username); //se seteaza ok param

             query.setParameter("password",password);


           Arbitru arbitru=(Arbitru)query.getSingleResult();

            session.getTransaction().commit();

 */
            Arbitru arbitru = session.createQuery("from Arbitru where username=:username and password =:password ", Arbitru.class).
                    setParameter("username", username).setParameter("password", password).setMaxResults(1).uniqueResult();
            session.getTransaction().commit();


            close();
           System.out.print(arbitru.toString());
            System.out.println(" asta e din repo Hibernate");
            return arbitru;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            close();
        }
        return null;
    }




}
