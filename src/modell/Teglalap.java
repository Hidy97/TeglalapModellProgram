package modell;

public class Teglalap {
    private int a;
    private int b;

    public Teglalap(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    

    public double terulet(){
        double terulet = a*b;
        return terulet;
    }
    
    public double kerulet(){
        double kerulet = 2*(a+b);
        return kerulet;
    }
    
    
}
