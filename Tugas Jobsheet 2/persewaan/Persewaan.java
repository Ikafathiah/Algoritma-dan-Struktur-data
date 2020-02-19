
package persewaan;
import java.util.Scanner;
public class Persewaan {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     TokoPersewaan tp1 = new TokoPersewaan();
     
    System.out.print("Masukkan id\t\t : ");
    tp1.id = sc.nextInt();
    System.out.print("masukkan nama\t\t : ");
    tp1.nama = sc.next();
    System.out.print("Masukkan nama game\t : ");
    tp1.game = sc.next();
    System.out.print("Masukkan lama pinjam\t : ");
    tp1.hari = sc.nextInt();
    System.out.print("masukkan harga\t\t : ");
    tp1.harga = sc.nextInt();
    System.out.println("------------------------------------------");
    System.out.println("          DATA HASIL PEMINJAMAN");
    System.out.println("------------------------------------------");
        
    
    tp1.DataHasilPinjaman();
    System.out.println("Harga total\t : "+tp1.Bayar());
        
     
    }
    
}
