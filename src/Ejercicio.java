
import java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float numero1, numero2;
        System.out.println("ingrese dos numeros");
        numero1= entrada.nextFloat();
        numero2= entrada.nextFloat();

        if (numero1>numero2 || numero2>numero1) {
            System.out.println("el mayor es "+numero1);
        } else {
            System.out.println("el mayor es"+numero2);

       
        }
         
    } 
} 
            
        

    

    

    


