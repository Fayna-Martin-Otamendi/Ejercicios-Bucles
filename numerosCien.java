public class numerosCien {

    public static void main(String[] args) {

        int ochos = 0;

        for (int i = 100; i >= 0; i -= 2) {
            System.out.println(i);  
            
            if(i % 10 == 8) {
                ochos++;
            }
          
        }
    System.out.println(ochos);
    
    
 }
}