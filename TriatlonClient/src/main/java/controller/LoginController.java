package controller;

import domain.Arbitru;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

import javafx.scene.control.TextField;
import triatlon.service.IService;

public class LoginController {
    IService service;
    public void setService(IService service){
        this.service=service;
    }
    @FXML
    private TextField emailLoginTextField;
    @FXML
    private PasswordField passwordLoginTextField;
    @FXML
    private Button exitButton;

    @FXML
    void handleLogin() throws Exception {
        String mail = emailLoginTextField.getText();
        String pass = passwordLoginTextField.getText();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/UserView.fxml"));
        AnchorPane root = loader.load();
        UserController ctrl = loader.getController();
        System.out.println("___________________________________________1");

        Stage userStage = new Stage();
        System.out.println("___________________________________________2");

        Arbitru a=null;
        try {

            a = service.getArbitruByUsernamePassword(mail, pass, ctrl);
            System.out.println("___________________________________________3");

            System.out.println(a);
        }catch (IllegalArgumentException e) {
            MessageAlert.showErrorMessage(null, "Incorrect data!");
        }
        if (a == null) MessageAlert.showErrorMessage(null,"This user does not exist");
        else {
            System.out.println("___________________________________________4");

            ctrl.setService(service, a);
            System.out.println("___________________________________________5");

            try {
                userStage.setScene(new Scene(root, 800, 450));
                System.out.println("___________________________________________6");

                userStage.setTitle("UserPage");
                userStage.show();
                Stage currentStage=(Stage)exitButton.getScene().getWindow();

                ctrl.setService(service, a);
                System.out.println("___________________________________________7");

                ctrl.setStage(currentStage);

                System.out.println("___________________________________________8");

                currentStage.close();
                } catch (Exception ex) { ex.printStackTrace();
            } finally {
                emailLoginTextField.clear();
                passwordLoginTextField.clear();
            }
        }
    }

    @FXML
    public void openUserStage(Arbitru arbitru){
        try {
            //open new stage
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/UserView.fxml"));
            AnchorPane root = loader.load();

            UserController ctrl = loader.getController();
            ctrl.setService(service,arbitru);

            Stage userStage = new Stage();
            userStage.setScene(new Scene(root, 800, 450));
            userStage.setTitle("UserPage");
            userStage.show();
        }catch(IOException e){e.printStackTrace();}
         catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    void handleExit() {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();

    }
}
