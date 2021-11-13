package template;

public class AgenteSaude extends Usuario {
    
    private int registro;
    public AgenteSaude(String nome, String senha, String dataNascimento, int CPF, int registro) {
        super(nome, senha, dataNascimento, CPF);
        this.registro = registro;
    }
    
    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
}
