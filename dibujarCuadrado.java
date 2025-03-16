import java.util.Scanner;

public class dibujarCuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int num;
         char n = '*';

        System.out.println("Introduce un número: ");
        num = scanner.nextInt();
        for (int i = 0; i < num; i++){
            for (int j = 0; j < num; j++){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}

        // Bucle que se repite hasta que el usuario ingrese la contraseña correcta
    

