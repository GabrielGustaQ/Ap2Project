package template;

public class Admin extends Usuario {
    private int id;

    public Admin(String nome, String senha, String dataNascimento, int CPF, int id) {
        super(nome, senha, dataNascimento, CPF);
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
