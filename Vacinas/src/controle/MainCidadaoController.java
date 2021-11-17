package controle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainCidadaoController extends Application{
    
    ObservableList<String> choiceList = FXCollections.observableArrayList("Covid 1°","Covid 2°","Tetano","Peste Bubonica","Febre Amarela","Variola","Febre Afitosa","Paralisia Infantil","Hidrofobia");
    @FXML
    private Label agendado1;

    @FXML
    private Label agendado2;

    @FXML
    private Label agendado3;

    @FXML
    private Label agendado4;

    @FXML
    private Label agendado5;

    @FXML
    private CheckBox check1;

    @FXML
    private CheckBox check2;

    @FXML
    private CheckBox check3;

    @FXML
    private CheckBox check4;

    @FXML
    private CheckBox check5;

    @FXML
    private CheckBox check6;

    @FXML
    private CheckBox check7;

    @FXML
    private CheckBox check8;

    @FXML
    private CheckBox check9;

    @FXML
    private ChoiceBox choiceBox;

    @FXML
    private Label covid1;

    @FXML
    private Label covid2;

    @FXML
    private DatePicker datePicker;

    @FXML
    private Label febreAfitosa;

    @FXML
    private Label febreAmarela;

    @FXML
    private Label hidrofobia;

    @FXML
    private Label paralisiaInfantil;

    @FXML
    private Label pesteBubonica;

    @FXML
    private Label tetano;

    @FXML
    private Label variola;

    @FXML

    private Button agendarButtonId;

    @FXML
    void agendarButton(ActionEvent event) {

    }
    @FXML
    private void initialize(){
        choiceBox.setItems(choiceList);
    }

    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/main_cidadao.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    } 

}

