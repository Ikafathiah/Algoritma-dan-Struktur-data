package pertanyaan;


import java.util.Scanner;


public class Perulangan {
        
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        System.out.print("Masukkan Nilai\t\t\t: ");
        int inNilai = input.nextInt();
        
        loopNilai(inNilai);
    }

    private static void loopNilai(int inNilai) {
        int hasil=0;
        for (int i = 0; i < 5; i++) {
            hasil = inNilai - 3;
            inNilai = hasil;
        }
        System.out.printf("Hasil akhir pengurangan nilai\t: %d\n",hasil);
        System.out.println("-----------------------------------------");
        cekHasil(hasil);
        System.out.println("-----------------------------------------");
    }

    private static void cekHasil(int hasil) {
        if(hasil%2 == 0){
            System.out.println("Hasil akhir termasuk bilangan genap");
        } else {
            System.out.println("Hasil akhir termasuk bilangan ganjil");
        }
    }

}
