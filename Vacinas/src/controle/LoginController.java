package controle;

//FAZER AVISO DE LOGIN BOTÃO de cancelar, e fechar o panel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import data.DadosCadastrais;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

import template.Admin;
import template.AgenteSaude;
import template.Cidadao;

public class LoginController implements Initializable {
    
    @FXML
    private TextField cpfAdmin;

    @FXML
    private TextField cpfAgente;

    @FXML
    private TextField cpfCidadao;

    @FXML
    private PasswordField senhaAdmin;

    @FXML
    private PasswordField senhaAgente;

    @FXML
    private PasswordField senhaCidadao;

    @FXML
    void cadAdimin(ActionEvent event) {
        try {
            AdminCadastroController ad = new AdminCadastroController();
            ad.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void loginAdmin(ActionEvent event) {
        try {
            DadosCadastrais dc = new DadosCadastrais();
            ArrayList <Admin> a = dc.listarAdmin();
            Admin d = null;
            for(int i=0; i<a.size();i++){
                if(a.get(i).getCpf()==Integer.parseInt(cpfAdmin.getText()) && senhaAdmin.getText().equals(a.get(i).getSenha())){
                    d = a.get(i);
                }
            }
            if(d == null){
                JOptionPane.showMessageDialog(null, "Acesso Negado");
            }else if(d.getCpf()==Integer.parseInt(cpfAdmin.getText()) && senhaAdmin.getText().equals(d.getSenha())){
                JOptionPane.showMessageDialog(null, "Acesso Concedido");
                MainAdminController c = new MainAdminController();
                c.start(new Stage());
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
    void loginAgente(ActionEvent event) {
        try {
            DadosCadastrais dc = new DadosCadastrais();
            ArrayList <AgenteSaude> a = dc.listarAgente();
            AgenteSaude d = null;
            for(int i=0;i<a.size();i++){
                if(a.get(i).getCpf()==Integer.parseInt(cpfAgente.getText()) && senhaAgente.getText().equals(a.get(i).getSenha())){
                    d = a.get(i);
                }
            }
            if(d == null){
                JOptionPane.showMessageDialog(null, "Acesso Negado");
            }else if(d.getCpf()==Integer.parseInt(cpfAgente.getText()) && senhaAgente.getText().equals(d.getSenha())){
                JOptionPane.showMessageDialog(null, "Acesso Concedido");
                MainAgenteController c = new MainAgenteController();
                c.start(new Stage());
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
    void loginCidadao(ActionEvent event) {
        try {
            DadosCadastrais dc = new DadosCadastrais();
            ArrayList <Cidadao> a = dc.listarCidadao();
            Cidadao d = null;
            for(int i=0;i<a.size();i++){
                if(a.get(i).getCpf()==Integer.parseInt(cpfCidadao.getText()) && senhaCidadao.getText().equals(a.get(i).getSenha())){
                    d = a.get(i);
                }
            }
            if(d == null){
                JOptionPane.showMessageDialog(null, "Acesso Negado");
            }else if(d.getCpf()==Integer.parseInt(cpfCidadao.getText()) && senhaCidadao.getText().equals(d.getSenha())){
                JOptionPane.showMessageDialog(null, "Acesso Concedido");
                MainCidadaoController c = new MainCidadaoController();
                c.start(new Stage());
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
    @FXML
    void cadAgente(ActionEvent event) throws IOException {
        try {
            AgenteCadastroController ag = new AgenteCadastroController();
            ag.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
