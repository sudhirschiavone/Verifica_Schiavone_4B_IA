public class Pista {
        Semaforo s1;
        
    public Pista(Semaforo s1) {
        this.s1 = s1;
    }
    public void entraInPista(Persona p){
        s1.P();
        System.out.println(p.getNome()+" e' entrato in Pista");
        try {
            long tot=0;
            long fine = System.nanoTime();
            for(int i=0; i<15;i++){
                Thread.sleep((long) (Math.random()*1000));
            }
            long inizio = System.nanoTime();
            tot =(fine-inizio)/100000;
            p.setTempo(tot);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(p.getNome()+ " e' uscito dalla ista");
        s1.V();
        p.getClassifica().aggiungi(p);
        p.getSpogliatoio().entraSpogliatoi(p);
    }

}
