# Laporan Praktikum Brutr Force Divide Conquer 2

## Belajar Sisip Gambar
<img src='Capture.png'>

## Latihan Brute Force
<img src='Capture1.png'>

## Latihan Divide Conquer
<img src='Capture2.png'>
jawaban pertanyaan
1. Nilai array indeks ke-0
Masukkan nilai: 2
Nilai array indeks ke-1
Masukkan nilai: 3
Nilai array indeks ke-2
Masukkan nilai: 4
Nilai array indeks ke-3
Masukkan nilai: 5
Nilai array indeks ke-4
Masukkan nilai: 6
Brute force
Nilai minimal : 0
Nilai maksimal : 6
Divide Conquer
Nilai minimal: 2
Nilai Maksimal: 3
2. Maksud dari program tersebut untuk menginstansiasi array of object ppArray
Dimana :
minMax[] ppArray = new minMax[5] -> sebagai instansiasi
ppArray[0] = new minMax(); -> sebagai inisialisasi atau memberikan nilai kepada object
3. 
package Praktikum1;
import java.util.Scanner;
//Praktikum1
public class minMax {
public int nilaiArray;
    public static void main(String[] args) {
      minMax[] ppArray = new minMax[5];
      ppArray[0] = new minMax();
      Scanner sc = new Scanner(System.in);
      
      for (int i=0; i<5; i++){
          ppArray[i] = new minMax();
          System.out.println("Nilai array indeks ke-"+i);
          System.out.print("Masukkan nilai: ");
          ppArray[i].nilaiArray = sc.nextInt();
          
       
      }
      
     
      
    }
    
    
    
}

4. Pada program tersebut berarti bahwa nilai 4 adalah indeks akhir atau batas dari array
yang diinputkan oleh user.
5. Karna menggunakan algoritma divide and conquer dimana array akan di bagi menjadi
beberapa bagian, untuk pembagian yang sama antara bagian kanan dan bagian kiri
maka memerlukan indeks awal yang merupakan indeks ke-0, indeks akhir merupakan
indeks ke-n, dan indeks tengah merupakan batas diantara keduanya 
6. Karena merupakan class tersendiri, dimana deklarasi class tidak boleh dilakukan di dalam
class lain.
7. Tidak bisa, karena nilai array pada array objek digunakan sebagai parameter
8.
9.
10.
11.  Yang lebih baik dari segi kecepatan memecah masalah adalah divide and
12. . Itu dinamakan ternary operation, : adalah sebagai else
Dimana penjelasanya :
Tanda “ : “ berarti pembanding/pembatas antara kondisi jika benar dengan kondisi
jika salah
Jika a>b ? maka c(jika benar) : d(jika salah)
13. Tanda ? merupakan bagian dari operator ternary, yang sama seperti simbolnya
menanyakan kondisi  
conquer,sedangkan Brute force lebih baik untuk yang ingin simpel dalam
pengkodeannya




## Tugas Praktikum
<img src='notasi.png'>
<img src='fibonacci.png'>
<img src='faktorial.png'>

