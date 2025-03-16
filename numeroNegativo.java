import java.util.Scanner;

public class numeroNegativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0, num = 0, contador = 0;
        double media = 0;


        do { 
            System.out.println("Introduce numero: ");
            num = scanner.nextInt();
        
            if (num >= 0){   
            suma += num;     
            contador++;
            }
        } while (num >= 0);
          
        if (contador > 0) {
            media = (double) suma / contador;
            System.out.println("La media de los números introducidos es: " + media);
        } else {
            System.out.println("El número negativo finalizó el programa");
        }

          
 }
    
}
