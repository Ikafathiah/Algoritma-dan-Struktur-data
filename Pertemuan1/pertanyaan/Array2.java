
import java.util.Scanner;

public class Array2 {
    
    public static Scanner input = new Scanner(System.in); 
    
    public static void main(String[] args) {
        int Array1[][] = new int[4][5];
        int nilai, hasil=0;
        
        
        
        for (int i = 0; i < Array1.length; i++) {
            for (int j = 0; j < Array1[0].length; j++) {
                System.out.print("Masukkan Nilai ["+i+"]["+j+"] = ");
                nilai = input.nextInt();
                hasil += nilai;
                nilai = hasil;
            }
            System.out.println("--------------------------------");
        }
        
        System.out.println("Total penjumlahan isi array adalah "+hasil);
        
    }
}
