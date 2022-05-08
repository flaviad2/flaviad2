package controller;

import domain.*;
import javafx.application.Platform;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import triatlon.service.IService;
import triatlon.service.Observer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class UserController implements Observer {
    IService service;
    Arbitru arbitru;
    Stage stage;
    public void setStage(Stage newStage){
        this.stage=newStage;
    }

    public void setService(IService service, Arbitru arbitru) throws Exception {

        this.service=service;
        this.arbitru=arbitru;
        labelName.setText("Hello, "+arbitru.getName());

        loadParticipantsListView();
        loadParticipantFromProba();
        generateRaport();
    }
    ObservableList<ParticipantPointsDTO> modelParticipantsPoints= FXCollections.observableArrayList();
    ObservableList<Participant> modelProbaParticipant= FXCollections.observableArrayList();
    ObservableList<ParticipantPointsDTO> modelParticipantFromProba= FXCollections.observableArrayList();
    @FXML
    private Button logoutButton;
    @FXML
    private Label labelName;
    @FXML
    private ListView<ParticipantPointsDTO> participantsListView;
    @FXML
    private TextField nopointsTextField;
    @FXML
    private ListView<Participant> participantsNotFromProbaListView;
    @FXML
    private ListView<ParticipantPointsDTO> participantsFromProbaListView;


    @FXML
    void handleLogout() throws Exception {
        Stage currentStage=(Stage)nopointsTextField.getScene().getWindow();
        service.logout(arbitru.getId());
        currentStage.close();
        stage.show();
    }

    @FXML
    void addPointsHandle() throws Exception {
        String error="";
        Participant p= participantsNotFromProbaListView.getSelectionModel().getSelectedItem();
        if(p==null) error+="You must select a participant!\n";

        Float points=null;
        try{
            points=Float.parseFloat(nopointsTextField.getText());
        }catch (Exception e){error+="You must enter a float number!";}
        if(!error.isEmpty()) MessageAlert.showErrorMessage(null,error);
        else {
            Proba proba = service.getProbaByIdArbitru(arbitru);
            Rezultat rezultat = new Rezultat(proba, p, points);
            service.addRezultat(rezultat,proba);
            generateRaport();
            loadParticipantFromProba();
        }
        nopointsTextField.clear();
    }


    void generateRaport() throws Exception {
        modelParticipantFromProba.clear();
        Proba proba = service.getProbaByIdArbitru(arbitru);
        Iterable<ParticipantPointsDTO> a=service.participantsFromProba(proba);
        List<ParticipantPointsDTO> list=(StreamSupport.stream(service.participantsFromProba(proba).spliterator(),false).collect(Collectors.toList()));
        modelParticipantFromProba.setAll(list);
        participantsFromProbaListView.setItems(modelParticipantFromProba);
    }

    void loadParticipantsListView() throws Exception {

        if(modelParticipantsPoints == null )
            System.out.println("Model participants e null");

        modelParticipantsPoints.clear();//sa stergi din bd c
        System.out.println("s-a facut clear");
        //System.out.println(modelParticipantsPoints);
        List<ParticipantPointsDTO> list=(StreamSupport.stream(service.participantPoints().spliterator(),false).collect(Collectors.toList()));
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));


        modelParticipantsPoints.setAll(list);
        System.out.println(list.get(0));
        participantsListView.setItems(modelParticipantsPoints);



    }

    void loadParticipantFromProba() throws Exception {
        modelProbaParticipant.clear();
        System.out.println("am ajuns in participants not from proba si am facut clear");


        Proba p=service.getProbaByIdArbitru(arbitru);
        System.out.println();
        List<Participant> list=(StreamSupport.stream(service.participantsNotFromProba(p).spliterator(),false).collect(Collectors.toList()));

        modelProbaParticipant.setAll(list);
        participantsNotFromProbaListView.setItems(modelProbaParticipant);

    }

    @Override
    public void notifyAddedPoints(Iterable<ParticipantPointsDTO> participants) throws Exception {
        Platform.runLater( ()-> {
            modelParticipantsPoints.clear();
            modelParticipantsPoints.setAll(StreamSupport.stream(participants.spliterator(),false).collect(Collectors.toList()));
            participantsListView.setItems(modelParticipantsPoints);
        });
    }

//    @Override
//    public void notifyRaportAddedPoints(List<ParticipantPointsDTO> participants) throws Exception {
//        modelParticipantFromProba.clear();
//        modelParticipantFromProba.setAll(participants);
//        participantsFromProbaListView.setItems(modelParticipantFromProba);
//    }
//
//    @Override
//    public void notifyParticipantsRefresh(List<Participant> participants) throws Exception {
//        //lista mica de participant not from proba
//        modelProbaParticipant.clear();
//        modelProbaParticipant.setAll(participants);
//        participantsNotFromProbaListView.setItems(modelProbaParticipant);
//    }

}
