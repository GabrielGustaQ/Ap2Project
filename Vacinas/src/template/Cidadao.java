package template;

import java.io.Serializable;

public class Cidadao extends Usuario implements Serializable {
    int cartaoDeVacina;

    public Cidadao(int cartaoDeVacina, String nome, String senha, String dataNascimento, int CPF) {
        super(nome, senha, dataNascimento, CPF);
        this.cartaoDeVacina = cartaoDeVacina;
    }
    
    @Override
    public int getCpf(){
        return super.getCpf();
    }
    
    @Override
    public String getSenha(){
        return super.getSenha();
    }

    @Override
    public String toString() {
        return "Cidadao{" + "cartaoDeVacina=" + cartaoDeVacina + '}'+super.toString();
    }
    
}
