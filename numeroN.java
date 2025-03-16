import java.util.Scanner;

public class numeroN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        boolean primo = true;

        System.out.println("Introduce numero: ");
        n = scanner.nextInt();

            if (n <= 1) {
            primo = false;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        primo = false;
            }
        } 
    } 
       
            if (primo) {
                System.out.println("El número es primo");
            } else {
                System.out.println("El número no es primo");
            }

System.out.println("Los números hasta 1 son: " + (n -= 1));
 }
    
    
}
