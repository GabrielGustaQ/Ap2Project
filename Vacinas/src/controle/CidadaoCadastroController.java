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

public class CidadaoCadastroController {
    
    @FXML
    private Label labelWarnig;

    @FXML
    private PasswordField psConSenha;

    @FXML
    private PasswordField psSenha;

    @FXML
    private Label psWarning;

    @FXML
    private TextField tfCPF;

    @FXML
    private TextField tfCartaoVacina;

    @FXML
    private TextField tfNascimento;

    @FXML
    private TextField tfNome;

    @FXML
    void cancelButton(ActionEvent event) {

    }

    @FXML
    void confirmaButton(ActionEvent event) {
        try {
            if(psConSenha.equals(psSenha)){
                System.out.println("teste 1");
                DadosCadastrais dc = new DadosCadastrais();
                dc.cadastrarCidadao(tfCartaoVacina.getText(), tfNome.getText(), psSenha.getText(), tfNascimento.getText(), tfCPF.getText());
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
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/Cidadao_cadastro.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    } 
}