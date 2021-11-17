package template;

import java.io.Serializable;
import java.util.ArrayList;

abstract class Usuario implements Serializable {
    private String nome;
    private String senha;
    private String dataNascimento;
    private int CPF;
    ArrayList<Vacina> vacina = new ArrayList<Vacina>();

    public Usuario(String nome, String senha, String dataNascimento, int CPF) {
        this.nome = nome;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Usuario\n" + " nome=" + nome + "\n senha=" + senha + "\n dataNascimento=" + dataNascimento + "\n CPF=" + CPF + "\n vacina=" + vacina ;
    }

    public int getCpf() {
        return CPF;
    }

    public String getSenha() {
        return senha;
    }
    
    
}