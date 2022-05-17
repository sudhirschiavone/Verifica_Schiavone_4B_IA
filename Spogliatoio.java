public class Spogliatoio {
    Semaforo s1;
    
    public Spogliatoio(Semaforo s1) {
        this.s1 = s1;
    }
    public void entraSpogliatoi(Persona p){
        s1.P();
        System.out.println(p.getNome()+" e' entrato nello spoglaitoio");
        try {
            Thread.sleep((long) (Math.random()*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(p.getNome()+ " e' uscito dallo spogliatoio");
        s1.V();
    }
}
