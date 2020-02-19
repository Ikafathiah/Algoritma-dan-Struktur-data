
package ProgramTanah;

import java.util.Scanner;

public class Tanah2 {
    public int panjang,lebar,jumlah;
    
    public int hitungLuas(){
        return panjang * lebar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah;
        Tanah2[] tnArray = new Tanah2[3];
        System.out.print("Masukkan Jumlah Tanah : ");
        jumlah = sc.nextInt();
        
        for (int i = 0; i < jumlah; i++) {
        tnArray[i] = new Tanah2();
        System.out.println("Tanah " + i);
        System.out.print("Masukkan Panjang: ");
        tnArray[i].panjang = sc.nextInt();
        System.out.print("Masukkan Lebar:");
        tnArray[i].lebar = sc.nextInt();
        }
        for (int i = 0; i < jumlah ; i++) {
            System.out.println("Luas Tanah ke :" + i + tnArray[i].hitungLuas());
        }
        int k=1;
            int luasb=0;
            int terluas=0;
            for (int i=0; i<jumlah; i++){
            if(tnArray[i].hitungLuas()>luasb){
            luasb=tnArray[i].hitungLuas();
            terluas=k;
            }
            k++;
            }
            System.out.println();
            System.out.println("Tanah terluas : Tanah "+terluas);
                }
    
}
