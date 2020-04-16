
package Tugas1;

/**
 *
 * @author ikafa
 */
public class Mahasiswa {
 private String nim;
 private String nama;
 private String alamat;
 public Mahasiswa(String nim, String nama, String alamat){
     this.nama= nama;
     this.nim=nim;
     this.alamat=alamat;
 }

    
 public String getnim(){
     return this.nim;
 }
 public String getnama(){
     return this.nama;
 }
 public String getalamat(){
     return this.alamat;
 }
 public String toString(){
 return String.format("%s\t|%.6s\t|%s\t|\n",nim,nama,alamat);
}
}

