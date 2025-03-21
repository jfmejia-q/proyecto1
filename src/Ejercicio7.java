
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("ingrese un numero entero");
        numero= entrada.nextInt();
        if (numero<10 && numero>0) {
            System.out.println("el numero es de una cifra");
            
        }else if (numero>=10 && numero<100) {
            System.out.println("el numero tiene dos cifras");
            
        } 

        if (numero>=100 && numero<1000) {
            System.out.println("el numero tiene tres cifras");
            
        }else if (numero>=1000) {
            
        
            System.out.println("el numero de cifras es mayor");
        }

    }
    
}
