import java.util.ArrayList;

public class Classifica {
    ArrayList<Persona> lista=new ArrayList<>();

    public Classifica() {
    }
    
    public void aggiungi(Persona p){
        for(int i=0;i<lista.size();i++){
            if(p.getNome()==lista.get(i).getNome()){
                System.out.println("Persona gia presente");
            }
        }
        lista.add(p);
        return;
    }
    public void ordina(){
        for(int i=0; i<lista.size();i++){
            if(lista.get(i).getTempo() < lista.get(i+1).getTempo()){
                Persona persona=lista.get(i);
                lista.set(i,lista.get(i+1));
                lista.set(i+1, persona);
            }
        }
    }
    public void risultato(){
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).getNome()+" ha fatto 15 giri in :"+lista.get(i).getTempo());
        }
    }
}
