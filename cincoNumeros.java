import java.util.Scanner;

public class cincoNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        int suma = 0,num;


        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduce numero: " + i);
            num = scanner.nextInt();
            suma += num; 
        }
    System.out.println("La suma de los números introducidos es: " + suma);
    
    
 }
    
}
