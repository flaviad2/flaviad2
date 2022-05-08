import domain.Arbitru;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repository.IRepositoryArbitru;
import repository.RepositoryArbitruDBhibernate;
import service.Service;
import utils.AbsConcurrentServer;
import utils.ChatRpcConcurrentServer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class StartRPCServer {
    private static int defaultPort=55558;
    public static void main(String[] args) {


        //IRepositoryArbitru repoA = new RepositoryArbitruDBhibernate();
        //System.out.println(repoA.getArbitruByUsernamePassword("a", "a").toString());
        //Long a = Long.valueOf(7);
        //repoA.getArbitruByUsernamePassword("a", "a");



        ApplicationContext context = new ClassPathXmlApplicationContext("ServerConfig3.xml");
        Service service = context.getBean(Service.class);
        AbsConcurrentServer server = new ChatRpcConcurrentServer(defaultPort, service);
        try {
            server.start();

        } catch (Exception e) {
            System.err.println("Error starting the server" + e.getMessage());
        }finally {
            try {
                server.stop();
            }catch(Exception e){
                System.err.println("Error stopping server "+e.getMessage());
            }
        }
    }
}
