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
import javax.swing.JOptionPane;
import template.Cidadao;

public class LoginController implements Initializable {
    
    @FXML
    private TextField tfCpf;

    @FXML
    private TextField tfSenha;

    @FXML
    void login(ActionEvent event) {
        try {
            DadosCadastrais dc = new DadosCadastrais();
            ArrayList <Cidadao> a = dc.listarCidadao();
            Cidadao d = null;
            for(int i=0;i<a.size();i++){
                if(a.get(i).getCpf()==Integer.parseInt(tfCpf.getText()) && tfSenha.getText().equals(a.get(i).getSenha())){
                    d = a.get(i);
                }else{
                }
            }
            if(d == null){
                JOptionPane.showMessageDialog(null, "Acesso Negado");
            }else if(d.getCpf()==Integer.parseInt(tfCpf.getText()) && tfSenha.getText().equals(d.getSenha())){
                JOptionPane.showMessageDialog(null, "Acesso Concedido");
            }else{
                JOptionPane.showMessageDialog(null, "Acesso Negado");
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(CidadaoCadastroController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CidadaoCadastroController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CidadaoCadastroController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    @FXML
    void cadCidadao(ActionEvent event) throws IOException {
        try {
            CidadaoCadastroController c = new CidadaoCadastroController();
            c.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
