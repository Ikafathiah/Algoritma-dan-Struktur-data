
package TestSearching;

/**
 *
 * @author ikafa
 */
public class BinaryMain {
    public static void main(String[] args) {
        int data[]={10, 30, 40, 50, 60, 70, 80, 90};
        
        Searching pencarian=new Searching(data,8);
        System.out.println("Isi Array");
        pencarian.TampilData();
        
        int cari=30;
       int posisi;
        
        
        System.out.println("=========================");
        System.out.println("menggunakan binary search");
        posisi=pencarian.FindBinarySearch(cari,0, data.length-1);
        pencarian.Tampilposisi(cari, posisi);
        
    }  
  
}
