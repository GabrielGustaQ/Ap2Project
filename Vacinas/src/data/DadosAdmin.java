package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import template.Admin;

public class DadosAdmin{
    public void cadastrarAdmin(Admin a)throws IOException, FileNotFoundException, ClassNotFoundException{
        ArrayList <Admin> admin = new ArrayList<Admin>();
        File arq = new File("listarAdmin.ser");
        if(arq.exists()){
            admin = listarAdmin();
        }
        admin.add(a);
        FileOutputStream fluxo = new FileOutputStream(arq);
        try(ObjectOutputStream gravarObj = new ObjectOutputStream(fluxo)){
            gravarObj.writeObject(admin);
        }
    }

    public ArrayList <Admin> listarAdmin() throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<Admin> admin;
        File arq = new File("listarAdmin.ser");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream lerObj = new ObjectInputStream(fluxo);
        admin = (ArrayList<Admin>) lerObj.readObject();
        return admin;
    }
    
    public void removerAdmin (Admin a) throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList <Admin> admin;
        File arq = new File ("listaAdmin.ser");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream lerObj = new ObjectInputStream(fluxo);
        admin = (ArrayList<Admin>) lerObj.readObject();
        for(int i = 0; i<admin.size();i++){
            if(admin.get(i).getId()== a.getId()){
                admin.remove(i);
            }
        }
        FileOutputStream fl = new FileOutputStream(arq);
        try (ObjectOutputStream gravarObj = new ObjectOutputStream(fl)) {
            gravarObj.writeObject(admin);
        }
        
    }
}