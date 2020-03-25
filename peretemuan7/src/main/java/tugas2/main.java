/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
import java.util.Scanner;
/**
 *
 * @author ikafa
 */
public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int[][] data ={{45,78,7,200,80}, {90,1,17,100,50}, {21,2,40,18,65}};
        cari pencarian = new cari(data, 3, 5);
        System.out.println("Pencarian data Array 2D menggunakan sequenrtial Search");
        System.out.println("======================================================");
        System.out.println("Isi array");
        pencarian.TampilData();
        System.out.println("=======================================================");
        System.out.println("Masukkan data :");
        int cari = sc. nextInt();
        int[] posisi= pencarian.TemuSeqSea(cari);
        pencarian.Tampilposisi(cari, posisi);
    }
 
}
