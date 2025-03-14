public class paresImpares {
    public static void main(String[] args) {

        int sumaPares = 0, sumaImpares = 0, pares = 0, impares = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 0){
                pares++;
                sumaPares += i;
            } else {
                impares++;
                sumaImpares += i;
            }
          
        }
    System.out.println("Los números pares con: " + pares);
    System.out.println("Los números impares son: " + impares);
    System.out.println("La suma de los pares es: " + sumaPares);
    System.out.println("La suma de los impares es: " + sumaImpares);
  }
}