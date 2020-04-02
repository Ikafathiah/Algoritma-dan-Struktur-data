
package uts;

/**
 *Nama : Ika Fathiah
 *Nim  : 1941720002
 *Kelas: TI 1F
 */
public class Buku {

 String judul;
 int jumlahHalaman;
 double tinggiBuku;
 
 Buku(String j, int jml, double tg){
  judul=j;
  jumlahHalaman=jml;
  tinggiBuku=tg;
 }
 Buku(){
     
 }
 
 public void tampil(){
     System.out.println("Judul : "+judul);  
     System.out.println("Jumlah halaman : "+jumlahHalaman);
     System.out.println("Tinggi buku : "+tinggiBuku);
     
 }
}
