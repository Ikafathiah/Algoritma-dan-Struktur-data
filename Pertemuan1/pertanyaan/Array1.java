
package pertanyaan;
import java.util.Scanner;
/**
 *
 * @author ikafa
 */
public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int[] angka = { 9,2,4,1,7,11,19,25,6,22,13,5,14,30,20};
      System.out.println("angka genap :");
      for (x=0; x < angka.length; x++){
        if (angka[x] %2==0){
            System.out.println(angka[x]+"");
        }
    }
      System.out.println("angka ganjil :");
       for (x=0; x < angka.length; x++){
        if (angka[x] %2!=0){
            System.out.println(angka[x]+"");
        }   
    }
}
}
