/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
import java.util.Scanner;
/**
 *
 * @author ikafa
 */
public class SearchingMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah data : ");
        int jumlah = sc.nextInt();
       int data[] = new int[jumlah];
       
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Data ke-"+(i+1)+" : ");
            data[i]=sc.nextInt();
            
        }
        Searching cari = new Searching(data,jumlah);
        MergeSort ms = new MergeSort();
        
        System.out.println("Isi array : ");
        cari.TampilData();
        
        System.out.print("Masukkan data yang dicari : ");
        int dataCari = sc.nextInt();
        System.out.println("Menggunakan Sequental Search");
        int posisi = cari.TemukanSequentialSearch(dataCari);
        cari.TampilPosisi(jumlah, posisi);
        
        System.out.println("================================");
        System.out.println("Pengurutan dengan merge sort : ");
        ms.mergeSort(data);
        ms.printArray(data);
        System.out.println("menggunakan binary search");
        posisi= cari.TemukanBinarySearch(dataCari, data, posisi, posisi);
        cari.TampilPosisi(jumlah, posisi);
    }
}
