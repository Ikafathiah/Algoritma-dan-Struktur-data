
import java.util.Scanner;

public class Perulangan2  {
    public static Scanner input = new Scanner(System.in);
    static long totalSaldo, hitungBunga;
    
    public static void main(String[] args) {
        
        System.out.println("---------------------------------------");
        System.out.print("Masukkan Jumlah Saldo Awal\t: ");
        long saldoAwal = input.nextLong();
                
        long saldoAkhir = hitungSaldo(saldoAwal);
        System.out.println("Saldo Selama 12 bulan\t\t: Rp."+saldoAkhir+",-");
    }

    static long hitungSaldo(long saldoAwal) {
        for (int i = 0; i < 12; i++) {
            hitungBunga = saldoAwal * 2 /100;
            totalSaldo = saldoAwal + hitungBunga;
            saldoAwal = totalSaldo;
        }
        return totalSaldo;
    }
}
