package controle;

import java.io.IOException;
import java.util.logging.Logger;
import data.DadosCadastrais;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.util.logging.Level;
import java.net.URL;
import java.util.ResourceBundle;



public class AdminCadastroController {

    @FXML
    private PasswordField psConfirmaSenha;
    @FXML
    private Label labelWarnig;
    @FXML
    private PasswordField psSenha;

    @FXML
    private TextField tfCpf;

    @FXML
    private TextField tfNascimento;

    @FXML
    private TextField tfNome;

    @FXML
    private TextField tfid;

    @FXML
    private Label psWarning;

    @FXML
    void cancelButton(ActionEvent event) {

    }

    @FXML
    void confirmaButton(ActionEvent event) {
        try {
            if(psConfirmaSenha.equals(psSenha)){
                System.out.println("teste 1");
                DadosCadastrais dc = new DadosCadastrais();
                dc.cadastrarAdmin(tfNome.getText(), psSenha.getText(), tfNascimento.getText(), tfCpf.getText(), tfid.getText());
                labelWarnig.setText("Cadastrado Com Sucesso");
            }else{
                psWarning.setText("senhas são diferentes!!!");
            }
        } catch (IOException ex) {
            Logger.getLogger(CidadaoCadastroController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CidadaoCadastroController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CidadaoCadastroController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/Admin_cadastro.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
