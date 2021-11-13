package data;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import template.*;

public class DadosCadastrais{

//Cadastrar cidadao


    public void cadastrarCidadao(String cartaoDeVacina, String nome, String senha, String dataNascimento, String CPF) throws Exception {
        Cidadao c = new Cidadao(Integer.parseInt(cartaoDeVacina), nome, senha, dataNascimento, Integer.parseInt(CPF));
        DadosCidadao dc = new DadosCidadao();
        dc.cadastrarCidadao(c);
    }
    
    public void removerCidadao (int cod) throws IOException, FileNotFoundException, ClassNotFoundException{
        DadosCidadao dd = new DadosCidadao();
        Cidadao d = pesquisarCidadao(cod);
        dd.removerCidadao(d);
    }
    
    public Cidadao pesquisarCidadao (int codigo) throws IOException, FileNotFoundException, ClassNotFoundException{
        Cidadao d = null;
        ArrayList <Cidadao> al = listarCidadao();
        for (int i=0; i<al.size(); i++){
            if (codigo==al.get(i).getCpf()){
                d= al.get(i);
                break;
            }
        }
        return d;
    }
    
    public String imprimirCidadao (int codigo) throws IOException, FileNotFoundException, ClassNotFoundException{
        Cidadao d = pesquisarCidadao(codigo);
        return d.toString();
    }
    
    public ArrayList<Cidadao> listarCidadao() throws IOException, FileNotFoundException, ClassNotFoundException{
        DadosCidadao ad = new DadosCidadao();
        return ad.listarCidadao();
    }


// Cadastrar Admin

    public void cadastrarAdmin(String nome, String senha, String dataNascimento, String CPF, String id)throws IOException, FileNotFoundException, ClassNotFoundException{
        Admin ad = new Admin(nome, senha, dataNascimento, Integer.parseInt(CPF), Integer.parseInt(id));
        DadosAdmin dc = new DadosAdmin();
        dc.cadastrarAdmin(ad);
    }

    public void removerAdmin (int cod) throws IOException, FileNotFoundException, ClassNotFoundException{
        DadosAdmin da = new DadosAdmin();
        Admin ad = pesquisarAdmin(cod);
        da.removerAdmin(ad);
    }
    
    public Admin pesquisarAdmin (int cod) throws IOException, FileNotFoundException, ClassNotFoundException{
        Admin ad = null;
        ArrayList <Admin> admin = listarAdmin();
        for (int i=0; i<admin.size(); i++){
            if (cod == admin.get(i).getId()){
                ad = admin.get(i);
                break;
            }
        }
        return ad;
    }

    public String imprimirAdmin (int codigo) throws IOException, FileNotFoundException, ClassNotFoundException{
        Admin ad = pesquisarAdmin(codigo);
        return ad.toString();
    }
    
    public ArrayList<Admin> listarAdmin() throws IOException, FileNotFoundException, ClassNotFoundException{
        DadosAdmin ad = new DadosAdmin(); 
        return ad.listarAdmin();
    }

// Cadastrar Agente

    public void cadastrarAgente(String nome, String senha, String dataNascimento, String CPF, String registro)throws IOException, FileNotFoundException, ClassNotFoundException{
        AgenteSaude ag = new AgenteSaude(nome, senha,  dataNascimento,Integer.parseInt(CPF), Integer.parseInt(registro));
        DadosAgente da = new DadosAgente();
        da.cadastrarAgente(ag);
    }

    public void removerAgente (int cod) throws IOException, FileNotFoundException, ClassNotFoundException{
        DadosAgente da = new DadosAgente();
        AgenteSaude ag = pesquisarAgente(cod);
        da.removerAgente(ag);
    }
    
    public AgenteSaude pesquisarAgente (int cod) throws IOException, FileNotFoundException, ClassNotFoundException{
        AgenteSaude ag = null;
        ArrayList <AgenteSaude> agenteSaude = listarAgente();
        for (int i=0; i<agenteSaude.size(); i++){
            if (cod == agenteSaude.get(i).getRegistro()){
                ag = agenteSaude.get(i);
                break;
            }
        }
        return ag;
    }

    public String imprimirAgente (int codigo) throws IOException, FileNotFoundException, ClassNotFoundException{
        AgenteSaude ag = pesquisarAgente(codigo);
        return ag.toString();
    }
    
    public ArrayList<AgenteSaude> listarAgente() throws IOException, FileNotFoundException, ClassNotFoundException{
        DadosAgente ag = new DadosAgente();
        return ag.listarAgente();
    }
}