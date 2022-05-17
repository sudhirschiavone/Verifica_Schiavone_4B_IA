public class Persona extends Thread{
    private String nome;
    private double tempo;
    Spogliatoio spogliatoio;
    Pista pista;
    Classifica classifica;
    
    public Persona(String nome,Spogliatoio spogliatoio,Pista pista,Classifica classifica) {
        this.nome = nome;
        tempo=0;
        this.spogliatoio=spogliatoio;
        this.pista=pista;
        this.classifica=classifica;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getTempo() {
        return tempo;
    }
    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    public Spogliatoio getSpogliatoio() {
        return spogliatoio;
    }
    public void setSpogliatoio(Spogliatoio spogliatoio) {
        this.spogliatoio = spogliatoio;
    }
    public Pista getPista() {
        return pista;
    }
    public void setPista(Pista pista) {
        this.pista = pista;
    }
    public Persona(Classifica classifica) {
        this.classifica = classifica;
    }
    public Classifica getClassifica() {
        return classifica;
    }
    public void setClassifica(Classifica classifica) {
        this.classifica = classifica;
    }
    @Override
    public void run() {
        try{
            spogliatoio.entraSpogliatoi(this);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            pista.entraInPista(this);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
