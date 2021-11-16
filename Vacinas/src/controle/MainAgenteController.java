package controle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import data.DadosCadastrais;
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
import javafx.scene.control.Label;
import javafx.stage.Stage;
import template.Cidadao;

public class MainAgenteController extends Application{

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
    private Button vacinaButtonId;

    @FXML
    private Label variola;

    @FXML
    void vacinarButton(ActionEvent event) {
        
    }
    @FXML
    private void initialize()throws IOException, FileNotFoundException, ClassNotFoundException{
        DadosCadastrais dc = new DadosCadastrais();
        ArrayList<Cidadao> cidadaos = dc.listarCidadao();
        ArrayList<String> nomes = null;
        for(int i = 0; i < cidadaos.size(); i++){
            nomes.add(cidadaos.get(i).getNome());
        }
        ObservableList<String> choiceList = FXCollections.observableArrayList(nomes);
        choiceBox.setItems(choiceList);
    }

    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/main_cidadao.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
}
