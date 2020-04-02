
package uts;
import java.util.Scanner;
/**
 *
 * @author ikafa
 */
public class main {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     Scanner s1 = new Scanner(System.in);
     
     DaftarBuku db= new DaftarBuku();
     int jumBuku =4;
     for (int i=0; i<jumBuku; i++){
         System.out.print("Judul = ");
         String judul = s1.nextLine();
         System.out.print("jumlah halaman  = ");
         int jumlahHalaman = s.nextInt();
         System.out.print("tinggi buku = ");
         double tinggiBuku = s.nextDouble();
         
         Buku b = new Buku(judul, jumlahHalaman, tinggiBuku);
         db.tambah(b);
         
        
     }
      System.out.println("Data Buku sebelum sorting = ");
         db.tampil();
         
        
         System.out.println("Data buku setelah sorting desc brerdasarkan tinggi buku = ");
         db.bubbleShort();
         db.tampil();
        int i, x, hasil = 0;
        boolean ketemu;
        double data[]={9.84, 29.7, 19.69, 9.84};
        
      
        

        x=4;
        hasil=db.search(data, x,x, 0, data.length-1);
        if(hasil>=0){
            System.out.println("angka "+x+" ketemu pada posisi ke "+hasil+1);
        }else{
            System.out.println("angka "+x+" tidak ditemukan");
        } 
    }
 
}
