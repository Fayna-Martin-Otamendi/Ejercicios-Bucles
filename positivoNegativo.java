import java.util.Scanner;

public class positivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0, num;


        do { 
            System.out.println("Introduce numero: ");
            num = scanner.nextInt();
            suma += num;
            if (num > 0){    
            System.out.println("El número es positivo");
            } else if (num < 0) {
            System.out.println("El número es negativo");
            }
        } while (num != 0);
          System.out.println("Se ha introducido un 0");   

          System.out.println("La suma de los números introducidos es: " + suma);
 }
    
}
