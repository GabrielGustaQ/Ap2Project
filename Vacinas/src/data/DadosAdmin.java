package data;

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
            gravarObj.writeObject(cidadao);
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
    
    public void removerAdmin (Cidadao d) throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList <Cidadao> cidadao;
        File arq = new File ("listaCidadao.ser");
        FileInputStream fluxo = new FileInputStream(arq);
        ObjectInputStream lerObj = new ObjectInputStream(fluxo);
        cidadao = (ArrayList<Cidadao>) lerObj.readObject();
        for(int i = 0; i<cidadao.size();i++){
            if(cidadao.get(i).getId()== d.getId()){
                cidadao.remove(i);
            }
        }
        FileOutputStream fl = new FileOutputStream(arq);
        try (ObjectOutputStream gravarObj = new ObjectOutputStream(fl)) {
            gravarObj.writeObject(cidadao);
        }
        
    }
}