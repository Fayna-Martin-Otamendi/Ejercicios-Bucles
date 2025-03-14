import java.util.Scanner;

public class tablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        
        do {
        System.out.println("Introduce un número del 1 al 20: ");
        num = scanner.nextInt();
        } while (num < 1 && num > 20);

        System.out.println("Tabla de multiplicar del " + num + ":");
        for (int i = 1; i <= 10; i++){
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}      