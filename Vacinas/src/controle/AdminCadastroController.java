package controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

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
    void cancelButton(ActionEvent event) {

    }

    @FXML
    void confirmaButton(ActionEvent event) {
        try{
            System.out.println("testeAdmin");
            DadosCadastrais dc = new DadosCadastrais();
            dc.
        }
    }

}
