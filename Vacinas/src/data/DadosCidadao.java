package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import template.Cidadao;

public class DadosCidadao {
    public void cadastrarCidadao(Cidadao d) throws IOException, FileNotFoundException, ClassNotFoundException{
        ArrayList <Cidadao> cidadao = new ArrayList();
        File arq = new File ("listaCidadao.ser");
        if (arq.exists()){
            cidadao = listarCidadao();
        }
        cidadao.add(d);
        FileOutputStream fluxo = new FileOutputStream(arq);
        try (ObjectOutputStream gravarObj = new ObjectOutputStream(fluxo)) {
            gravarObj.writeObject(cidadao);
        }
    }
    
    public ArrayList<Cidadao> listarCidadao() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList <Cidadao> cidadao;
        File arq = new File ("listaCidadao.ser");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream lerObj = new ObjectInputStream(fluxo);
        cidadao = (ArrayList<Cidadao>) lerObj.readObject();
        return cidadao;
    }
    
    public void removerCidadao (Cidadao d) throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList <Cidadao> cidadao;
        File arq = new File ("listaCidadao.ser");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream lerObj = new ObjectInputStream(fluxo);
        cidadao = (ArrayList<Cidadao>) lerObj.readObject();
        for(int i = 0; i<cidadao.size();i++){
            if(cidadao.get(i).getCpf()== d.getCpf()){
                cidadao.remove(i);
            }
        }
        FileOutputStream fl = new FileOutputStream(arq);
        try (ObjectOutputStream gravarObj = new ObjectOutputStream(fl)) {
            gravarObj.writeObject(cidadao);
        }
        
    }
    
}

