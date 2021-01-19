package esclassroomthread;

public class EsClassroomThread {

    public static void main(String[] args) {
        Processo P1 = new Processo('A');
        Processo P2 = new Processo('B');
        
        Thread T1 = new Thread(P1);
        Thread T2 = new Thread(P2);
        
        T1.start();
        T2.start();
    }
}
