import java.util.Scanner;

public class calcularCuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, cuadrado;

        do { 
            System.out.println("Introduce numero: ");
            num = scanner.nextInt();
            if (num >= 0){
            cuadrado = num * num;
            System.out.println("El cuadrado de " + num + " es: " + cuadrado);
            }
        } while (num > 0);
          System.out.println("Error. Número negativo");   
 }
} 
