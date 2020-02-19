
package programjajargenjang;
import java.util.Scanner;
public class ProgramJajarGenjang {

    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     JajarGenjang jg = new JajarGenjang();
     
        System.out.print("Masukkan nilai tinggi\t :");
        jg.tinggi =sc.nextInt();
        System.out.print("Masukkan nilai panjang\t :");
        jg.panjang = sc.nextInt();
        System.out.print("Masukkan sisi miring\t :");
        jg.sisiMiring=sc.nextInt();
        
        System.out.println("Luas jajar genjang\t :"+jg.hitungLuas());
        System.out.println("Keliling jajar genjang   :"+jg.hitungKeliling());
    }
    
}
