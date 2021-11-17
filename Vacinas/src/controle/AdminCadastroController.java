package controle;

import java.io.IOException;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import data.DadosCadastrais;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import template.Admin;

import java.util.ArrayList;
import java.util.logging.Level;

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
    private Button confirmaButtonId;

    @FXML
    void cancelButton(ActionEvent event) {

    }

    @FXML
    void confirmaButton(ActionEvent event) {
        try {
            DadosCadastrais dc = new DadosCadastrais();
            boolean existe = false;
            ArrayList <Admin> a = dc.listarAdmin();
                for(int i=0;i<a.size();i++){
                if(a.get(i).getCpf() == Integer.parseInt(tfCpf.getText())){
                existe = true;
               }
            }
            if(existe == false){
                if(psConfirmaSenha.getText().equals(psSenha.getText())){              
                    dc.cadastrarAdmin(tfNome.getText(), psSenha.getText(), tfNascimento.getText(), tfCpf.getText(), tfid.getText());
                    JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!!!");
                    Stage stage = (Stage) confirmaButtonId.getScene().getWindow(); //Obtendo a janela atual
                    stage.close(); //Fechando o Stage
                }else{
                    psWarning.setText("senhas são diferentes!!!");
                }
            }else{
                labelWarnig.setText("Administrador já cadastrado !!!");
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
