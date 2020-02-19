
package programtanah;
import java.util.Scanner;

public class ProgramTanah {
    public int panjang,lebar,n;    


public int hitungLuas(){
    return panjang * lebar;
}
public ProgramTanah(){
    
}


    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Masukkan jumlah tanah\t :");
        int jumlahtTanah = sc.nextInt();
     ProgramTanah[] tArray = new ProgramTanah[jumlahtTanah];
     
     
        
        for (int i = 0; i < jumlahtTanah; i++) {
            tArray[i]= new ProgramTanah();
            System.out.println("Tanah "+(i+1));
            System.out.println("Masukkan panjang\t :");
            tArray[i].panjang = sc.nextInt();
            System.out.println("Masukkan Lebar");
            tArray[i].lebar = sc.nextInt();
            
        }
        System.out.println();
        for(int i=0; i<=jumlahtTanah; i++){
            System.out.println("Luas tanah : "+i+" : "+tArray[i].hitungLuas());
        }
                
    }
    
    
}
