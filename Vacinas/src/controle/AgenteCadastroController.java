package controle;

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

import javax.swing.JOptionPane;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import template.AgenteSaude;

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
    private Button confirmaButtonId;

    @FXML
    void cancelButton(ActionEvent event) {

    }

    @FXML
    void confirmaButton(ActionEvent event) {
        try {
            DadosCadastrais dc = new DadosCadastrais();
            boolean existe = false;
            ArrayList <AgenteSaude> a = dc.listarAgente();
                for(int i=0;i<a.size();i++){
                if(a.get(i).getCpf() == Integer.parseInt(tfCpf.getText())){
                   existe = true;
                }
            }
            if(existe == false){
                if(psConfirmasenha.getText().equals(psSenha.getText())){
                    dc.cadastrarAgente(tfNome.getText(), psSenha.getText(), tfNascimento.getText(), tfCpf.getText(), tfRegistro.getText());
                    JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!!!");
                    Stage stage = (Stage) confirmaButtonId.getScene().getWindow(); //Obtendo a janela atual
                    stage.close(); //Fechando o Stage
                }else{
                    psWarning.setText("senhas são diferentes!!!");
                }
            }else{
                labelWarning.setText("Agente ja cadastrado");
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
