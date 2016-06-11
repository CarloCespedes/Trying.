package triangulo;
import Exceptions.ErrorNoPositiveNumber;
import Exceptions.ErrorParameterMissed;
import Exceptions.ErrorToMuchParameters;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Carlo
 */
public class TrianguloMain {
    
    public static void main(String[] args) throws ErrorParameterMissed, ErrorToMuchParameters, ErrorNoPositiveNumber {
        int Lad1, Lad2, Lad3;
        try{
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el primer lado del triangulo");
        Lad1 = teclado.nextInt();
        System.out.println("Ingrese el segundo lado del triangulo");
        Lad2 = teclado.nextInt();
        System.out.println("Ingrese el tercer lado del triangulo");
        Lad3 = teclado.nextInt();

        TrianguloClass  tri;
        tri = new TrianguloClass(Lad1,Lad2,Lad3);

        String lados = tri.lados();

        System.out.println(lados);
        }
        catch(InputMismatchException | ErrorParameterMissed | ErrorToMuchParameters | ErrorNoPositiveNumber e){
            System.out.println("Houston! Tenemos problemas");
            System.out.println("Misión abortada.");
            System.out.println(e);
        }
    }
}