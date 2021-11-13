package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import template.AgenteSaude;

public class DadosAgente{
    public void cadastrarAgente(AgenteSaude ag)throws IOException, FileNotFoundException, ClassNotFoundException{
      ArrayList <AgenteSaude> agente = new ArrayList<AgenteSaude>();
        File arq = new File("listarAgente.ser");
        if(arq.exists()){
            agente = listarAgente();
        }
        agente.add(ag);
        FileOutputStream fluxo = new FileOutputStream(arq);
        try(ObjectOutputStream gravarObj = new ObjectOutputStream(fluxo)){
            gravarObj.writeObject(agente);
        }
    }

    public ArrayList <AgenteSaude> listarAgente() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<AgenteSaude> agente;
        File arq = new File("listarAgente.ser");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream lerObj = new ObjectInputStream(fluxo);
        agente = (ArrayList<AgenteSaude>) lerObj.readObject();
        return agente;
    }
    
    public void removerAgente (AgenteSaude ag) throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList <AgenteSaude> agente;
        File arq = new File ("listarAgente.ser");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream lerObj = new ObjectInputStream(fluxo);
        agente = (ArrayList<AgenteSaude>) lerObj.readObject();
        for(int i = 0; i<agente.size();i++){
            if(agente.get(i).getRegistro()== ag.getRegistro()){
                agente.remove(i);
            }
        }
        FileOutputStream fl = new FileOutputStream(arq);
        try (ObjectOutputStream gravarObj = new ObjectOutputStream(fl)) {
            gravarObj.writeObject(agente);
        }
        
    }
}