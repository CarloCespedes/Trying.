/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

/**
 *
 * @author Carlo
 */
public class TrianguloClass {
    private int Lad1, Lad2, Lad3;

    public TrianguloClass(int Lad1, int Lad2, int Lad3) {
        this.Lad1 = Lad1;
        this.Lad2 = Lad2;
        this.Lad3 = Lad3;
    }

    public int getLad1() {
        return Lad1;
    }

    public void setLad1(int Lad1) {
        this.Lad1 = Lad1;
    }

    public int getLad2() {
        return Lad2;
    }

    public void setLad2(int Lad2) {
        this.Lad2 = Lad2;
    }

    public int getLad3() {
        return Lad3;
    }

    public void setLad3(int Lad3) {
        this.Lad3 = Lad3;
    }
    
    public String lados(){
        if ((Lad1 == Lad2) && (Lad2 == Lad3))
            return "Es un triangulo Equilatero";
        if (((Lad1 == Lad2)&& Lad3 != Lad1) || ((Lad1 == Lad3) && Lad2 != Lad1) || ((Lad2 == Lad3) && Lad1 != Lad2))
            return "Es un triagulo Isoceles";
        else
            return "Es un triangulo Escaleno";
    }
}


