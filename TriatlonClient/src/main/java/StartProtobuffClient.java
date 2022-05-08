import controller.LoginController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import triatlon.service.IService;

public class StartProtobuffClient extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    public static IService getService(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ClientConfig2.xml");
        return context.getBean(IService.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/LoginView.fxml"));
            AnchorPane root = loader.load();

            LoginController ctrl = loader.getController();
            ctrl.setService(getService());

            primaryStage.setScene(new Scene(root, 345, 470));
            primaryStage.setTitle("Login");
            primaryStage.show();
        }catch(
                IOException e){e.printStackTrace();}
    }
}
