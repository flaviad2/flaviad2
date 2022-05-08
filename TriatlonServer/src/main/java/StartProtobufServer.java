import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Service;
import utils.AbsConcurrentServer;
import utils.ChatRpcConcurrentServer;
import utils.ProtobuffConcurentServer;

public class StartProtobufServer {
    private static int defaultPort=55552;
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ServerConfig.xml");
        Service service = context.getBean(Service.class);
        AbsConcurrentServer server = new ProtobuffConcurentServer(defaultPort, service);
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
