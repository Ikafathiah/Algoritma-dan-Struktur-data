
package tokobarang;
import java.util.Scanner;

public class TokoBarang {

    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     Barang b1 = new Barang();
        System.out.print("Masukkan nama\t\t : ");
        b1.nama = sc.next();
        System.out.print("Masukkan harga satuan\t : ");
        b1.hargaSatuan =sc.nextInt();
        System.out.print("Masukkan jumlah\t\t : ");
        b1.jumlah = sc.nextInt();
        
        System.out.println("Harga Bayar\t\t : "+b1.hitungHargaBayar());
        
       
    }
    
}
