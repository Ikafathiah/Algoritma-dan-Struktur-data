
package minggu8;
import java.util.Scanner;
/**
 *
 * @author ikafa
 */
public class PosfixMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika");
        Q=sc.nextLine();
        Q=Q.trim();
        Q=Q+ ")";
        
        int total= Q.length();
        Posfix pos= new Posfix(total);
        P=pos.konversi(Q);
        System.out.println("Postfix: "+P);
         
    }
  
}
