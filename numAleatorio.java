import java.util.Scanner;
import java.util.Random;

public class numAleatorio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random numRandom = new Random();

        int numAleatorio = numRandom.nextInt(100) + 1;
        int numUsuario, intentos = 0;
        boolean adivinado = false;

        while (intentos < 10 && !adivinado){
            System.out.println("Intento " + (intentos + 1) + ": ");
            numUsuario = scanner.nextInt();
            intentos++;

        
        if (numAleatorio == numUsuario) { 
            System.out.println("Felicidades! Has adivinado el número");
            adivinado = true;
        } else if (numAleatorio < numUsuario) {
            System.out.println("Tu número es mayor");
        } else {
            System.out.println("Tu número es menor");
        }
    }  
    if (!adivinado) {
        System.out.println("Se acabaron los intentos");
    }
       

    }
}    
