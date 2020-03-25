/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author ikafa
 */
public class main {

    public static void main(String[] args) {
        int[] data = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        pencarian cari = new pencarian(data, 10);
        MergeSort ms = new MergeSort();

        System.out.println("Pencarian Nilai Array Terbesar Menggunakan Binary Search");
        System.out.println("===========================================================");
        System.out.println("Isi Array : ");
        cari.TampilData();
        System.out.println("===========================================================");

        System.out.println("Sorting dengan merge sort : ");
        ms.mergeSort(data);
        ms.printArray(data);
        System.out.println("===========================================================");

        System.out.println("Nilai Elemen Array Terbesar : " + cari.maks(data));
        int carii = cari.maks(data);
        System.out.println("Jumlah nilai terbesar : " + cari.jumlahTerbesar(carii, data));
        int posisi[] = new int[cari.terbesar];
        for (int i = 0; i < cari.terbesar; i++) {
            posisi[i] = cari.FindBinarySearch(carii, data, 0, data.length-1);
            if (i > 0) {
               cari.Tampilposisi(carii, posisi[i+1]);
            } else {
                cari.Tampilposisi(carii, posisi[i]);
            }
        }
    }
}
    

