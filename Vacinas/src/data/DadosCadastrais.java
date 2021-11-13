package data;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import template.Cidadao;

public class DadosCadastrais{

//Cadastrar cidadao


    public void cadastrarCidadao(String text, String text0, String text1, String text2, String text3, String text4) throws Exception {
        if(!(text3.equals(text4))){
            throw new Exception();
        }
        Cidadao c = new Cidadao(Integer.parseInt(text2), text, text3, text1, Integer.parseInt(text0));
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
            if (codigo==al.get(i).getId()){
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
}

// Cadastrar Admin

    public void cadastrarAdmin()
