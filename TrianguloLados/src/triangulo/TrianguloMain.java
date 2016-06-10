package triangulo;
import java.util.Scanner;

/**
 *
 * @author Carlo
 */
public class TrianguloMain {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el primer lado del triangulo");
        int Lad1 = teclado.nextInt();
        System.out.println("Ingrese el segundo lado del triangulo");
        int Lad2 = teclado.nextInt();
        System.out.println("Ingrese el tercer lado del triangulo");
        int Lad3 = teclado.nextInt();
        
        if ((Lad1 == Lad2) && (Lad2 == Lad3)){
        System.out.println("Es un triangulo Equilatero");
        }
        if (((Lad1 == Lad2)&& Lad3 != Lad1) || ((Lad1 == Lad3) && Lad2 != Lad1) || ((Lad2 == Lad3) && Lad1 != Lad2) )
            System.out.println("El triangulo es Isoceles");
        if ((Lad1 != Lad2)&& (Lad3 != Lad1) && (Lad2 != Lad3)){
            System.out.println("El triangulo es Escaleno");
        }
    }
}