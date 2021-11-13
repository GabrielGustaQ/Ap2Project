package controle;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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

public class CidadaoCadastroController implements Initializable {
    
    @FXML
    private TextField tfNome;

    @FXML
    private TextField tfCpf;

    @FXML
    private TextField tfNascimento;

    @FXML
    private TextField tfCartaoVacina;

    @FXML
    private PasswordField psSenha;

    @FXML
    private PasswordField psConSenha;

    @FXML
    private Button btConfirma;

    @FXML
    void confirmaCadastro(ActionEvent event) {
        try {
            System.out.println("teste 1");
            DadosCadastrais dc = new DadosCadastrais();
            dc.cadastrarCidadao(tfNome.getText(), tfCpf.getText(), tfNascimento.getText(), tfCartaoVacina.getText(), psSenha.getText(), psConSenha.getText());

        } catch (IOException ex) {
            Logger.getLogger(CidadaoCadastroController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CidadaoCadastroController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CidadaoCadastroController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    @FXML
    void tt(ActionEvent event) {
        try {
            DadosCadastrais dc = new DadosCadastrais();
            ArrayList a = dc.listarCidadao();
            for(int i=0; i<a.size();i++){
                System.out.println(a.toString());
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
}