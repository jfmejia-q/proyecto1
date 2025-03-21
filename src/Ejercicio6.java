
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero;
        System.out.println("ingrese un numero");
        numero= entrada.nextInt();
        if (numero>=1 ) {
            System.out.println("el numero es positivo"+numero);

        } else if (numero<0) {
            
        System.out.println("el numero es negativo"+numero);

        } 
          if (numero==0) {
            System.out.println("el numero es nulo"+numero);
            
          }


    
}
}