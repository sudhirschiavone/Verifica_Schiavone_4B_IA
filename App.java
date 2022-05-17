public class App {
    public static void main(String[] args) throws Exception {
        Semaforo s_Spogliatoio=new Semaforo(2);
        Semaforo s_Pista=new Semaforo(4);
        Classifica classifica=new Classifica();
        Pista pista =new Pista(s_Pista);
        Spogliatoio spogliatoio=new Spogliatoio(s_Spogliatoio);

        Persona p1=new Persona("Giovanni", spogliatoio,pista,classifica);
        Persona p2=new Persona("Giole", spogliatoio,pista,classifica);
        Persona p3=new Persona("Francesco", spogliatoio,pista,classifica);
        Persona p4=new Persona("Dario", spogliatoio,pista,classifica);
        Persona p5=new Persona("Lorenzo", spogliatoio,pista,classifica);
        Persona p6=new Persona("Paolo", spogliatoio,pista,classifica);
        Persona p7=new Persona("Mirko", spogliatoio,pista,classifica);
        Persona p8=new Persona("Diana", spogliatoio,pista,classifica);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();


        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        p7.join();
        p8.join();

        
        classifica.risultato();
        System.out.println("Fine Programma");
    }
}
