
package pertanyaan;
import java.util.Scanner;

public class Pemilihan2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Masukkan nilai y : ");
       int y = sc.nextInt();
       if (y%2==0 && y%6!=0 && y%15!=0){
           System.out.println("Bilangan kelipatan 2");
       }
       else if (y%6==0 && y%15!=0){
           
           
              System.out.println("Bilangan kelipatan 6"); 
           }
       
       else if ( y%15==0){
    
         System.out.println("Bilangan kelipatan 15");    
       }
       else {
            System.out.println("Bilangan bukan kelipatan 2, 6, atau 15 "); 
       }
       
    }
}
