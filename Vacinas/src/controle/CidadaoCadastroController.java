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
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import template.Cidadao;

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
    private Button confirmaButtonId;

    @FXML
    void cancelButton(ActionEvent event) {
        //CidadaoCadastroController.close();
    }

    @FXML
    void confirmaButton(ActionEvent event) {
        try {
            DadosCadastrais dc = new DadosCadastrais();
            boolean existe = false;
            ArrayList <Cidadao> a = dc.listarCidadao();
                for(int i=0;i<a.size();i++){
                if(a.get(i).getCpf() == Integer.parseInt(tfCPF.getText())){
                   existe = true;
                }
            }
            
            if(existe == false){
                if(psConSenha.getText().equals(psSenha.getText())){
                    dc.cadastrarCidadao(tfCartaoVacina.getText(), tfNome.getText(), psSenha.getText(), tfNascimento.getText(), tfCPF.getText());
                    JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!!!");
                    Stage stage = (Stage) confirmaButtonId.getScene().getWindow(); //Obtendo a janela atual
                    stage.close(); //Fechando o Stage
                    
                }else{
                    psWarning.setText("senhas são diferentes!!!");
                }
            }else{
                labelWarnig.setText("Cidadão já cadastrado !!!");
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