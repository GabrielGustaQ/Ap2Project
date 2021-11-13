package controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import data.DadosCadastrais;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
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
    private Label psWarning;

    @FXML
    void cancelButton(ActionEvent event) {

    }

    @FXML
    void confirmaButton(ActionEvent event) {
        try {
            if(psConfirmasenha.getText().equals(psSenha.getText())){
                System.out.println("teste 1");
                DadosCadastrais dc = new DadosCadastrais();
                dc.cadastrarAgente(tfNome.getText(), psSenha.getText(), tfNascimento.getText(), tfCpf.getText(), tfRegistro.getText());
                labelWarning.setText("Cadastrado Com Sucesso");
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
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/Vacinador_cadastro.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

}
