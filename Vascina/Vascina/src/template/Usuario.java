package template;

import java.io.Serializable;
import java.util.ArrayList;

abstract class Usuario implements Serializable {
    private static int totId = 0;
    private int id;
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
        id = totId;
        totId++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", senha=" + senha + ", dataNascimento=" + dataNascimento + ", CPF=" + CPF + ", vacina=" + vacina + '}';
    }

    public int getCpf() {
        return CPF;
    }

    public String getSenha() {
        return senha;
    }
    
    
}