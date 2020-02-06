
package TugasDua;


public class Bank {
   public static void main(String[] args) {
       int x=0;
       double bunga=0;
       System.out.println("Saldo awal= Rp. 1.000.000");
       System.out.println("Saldo akhir= Rp. 1.500.000");
       for (int saldo = 1000000; saldo<= 1500000; saldo += bunga){
           bunga = saldo * 0.02;
           x++;
           
           
       }
       
       System.out.println("Lama menabung = "+x+" bulan");
   }
}
