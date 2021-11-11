package controle;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import data.DadosCadastrais;

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
        DadosCadastrais dc = new DadosCadastrais();
        dc.cadastrarCidadao(tfNome.getText(), tfCpf.getText(), tfNascimento.getText(), tfCartaoVacina.getText(), psSenha.getText(), psConSenha.getText());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}