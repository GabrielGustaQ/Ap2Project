package controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import data.DadosCadastrais;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AgenteCadastroController {

    @FXML
    private Label labelWarning;

    @FXML
    private PasswordField psConfirmasenha;

    @FXML
    private PasswordField psSenha;

    @FXML
    private TextField tfCpf;

    @FXML
    private TextField tfNascimento;

    @FXML
    private TextField tfNome;

    @FXML
    private TextField tfRegistro;

    @FXML
    void cancelButton(ActionEvent event) {

    }

    @FXML
    void confirmaButton(ActionEvent event) {
        try {
            System.out.println("teste 1");
            DadosCadastrais dc = new DadosCadastrais();
            dc.cadastrarAdmin(tfNome.getText(), tfCpf.getText(), tfNascimento.getText(), tfCartaoVacina.getText(), psSenha.getText(), psConSenha.getText());
            labelWarning.setText("Cadastrado Com Sucesso");

        } catch (IOException ex) {
            Logger.getLogger(CidadaoCadastroController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CidadaoCadastroController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CidadaoCadastroController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
