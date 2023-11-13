package nezet;

import java.util.Scanner;
import modell.Teglalap;

public class Megjelenito {
    private Scanner scr = new Scanner(System.in);
    private Teglalap tegla;
    
    public Megjelenito() {
        inicializalas();
        
        feladat();
    }
    
    private void inicializalas(){
        int a = bekeres("\'A\' oldal:");
        int b = bekeres("\'B\' oldal:");
        tegla = new Teglalap(a, b);
    }

    private int bekeres(String kerdes){
        System.out.println(kerdes);
        return scr.nextInt();
    }
    
    private void feladat(){
        System.out.println("A téglalap területe, kerülete: ");
        System.out.printf("\tT: %.3f\n", tegla.terulet());
        System.out.printf("\tK: %.3f\n", tegla.kerulet());
    }
}
