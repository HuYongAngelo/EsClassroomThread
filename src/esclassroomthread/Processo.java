package esclassroomthread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Processo extends Thread {
    private boolean terminato;
    private char p;
    
    public Processo(char p) {
        this.p = p;
        terminato = false;
    }
    
    public void run() {
        if (p == 'A') {
            long i=5;
            long a=i--;
            
            while (!terminato) {
                System.out.println(a+"*"+i+"="+a*i);
                a=a*i;
                i--;
                
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Processo.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (i<=0) {
                    Ferma();
                }
            }
        } else if (p == 'B') {
            long i=6;
            long a=i--;
            
            while (!terminato) {
                System.out.println("                              "+a+"*"+i+"="+a*i);
                a=a*i;
                i--;
                
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Processo.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (i<=0) {
                    Ferma();
                }
            }
        }
    }
    
    public void Ferma() {
        terminato = true;
    }
}