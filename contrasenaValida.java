import java.util.Scanner;

public class contrasenaValida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contrasenaInicial = "1234"; // Contraseña guardada
        String contrasenaUsuario;

        // Bucle que se repite hasta que el usuario ingrese la contraseña correcta
        do { 
            System.out.println("Introduce contraseña:");
            contrasenaUsuario = scanner.nextLine();
        } while (!contrasenaUsuario.equals(contrasenaInicial)); // Comparar Strings con .equals()

        System.out.println("Contraseña correcta. Acceso permitido."); // Mensaje de éxito
    }
} 
