import java.util.Scanner;

public class pedirNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0, num;


        do { 
            System.out.println("Introduce numero: ");
            num = scanner.nextInt();
            suma += num;
        } while (num != 0);
          System.out.println("Se ha introducido un 0");   

          System.out.println("La suma de los números introducidos es: " + suma);
 }
    
}
