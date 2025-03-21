import java.util.Scanner;
public class App {

        public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in);
        float nota1,nota2,nota3,notafinal;
       System.out.println("digite las tres notas");
       nota1= entrada.nextFloat();
       nota2= entrada.nextFloat();
       nota3= entrada.nextFloat();

       notafinal=(nota1+nota2+nota3)/3;
       System.out.println("la nota final es"+notafinal);

       if (notafinal>7) {
        System.out.println("promocionado");
        } else {
        System.out.println("no promocionado");
       }
    }
}

