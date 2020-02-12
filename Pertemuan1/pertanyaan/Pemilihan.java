
package pertanyaan;
import java.util.Scanner;

public class Pemilihan {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Masukkan nilai tugas : ");
       int tugas =sc.nextInt();
       int A = tugas * 20/100;
       System.out.print("Masukkan nilai UTS : ");
       int UTS =sc.nextInt();
       int B = UTS * 35/100;
       System.out.print("Masukkan nilai UAS : ");
       int UAS =sc.nextInt();
       int C = UAS * 45/100;
       
       int nilai = A+B+C;
       System.out.println("Nilai = "+nilai);
       
     
    }
    
}
