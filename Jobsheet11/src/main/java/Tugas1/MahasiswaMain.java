
package Tugas1;

/**
 *
 * @author ikafa
 */

public class MahasiswaMain {
    public static void main(String[] args) {
       Mahasiswa mhs1= new Mahasiswa("232","Siska", "Jakarta");
       Mahasiswa mhs2= new Mahasiswa("231","Rani", "Bali");
       Mahasiswa mhs3= new Mahasiswa("235","Dewi", "Bandung");
       Mahasiswa mhs4= new Mahasiswa("233","Randi", "Malang");
       Mahasiswa mhs5= new Mahasiswa("234","Rizky", "Surabaya");
       Mahasiswa mhs6= new Mahasiswa("237","Dani", "Aceh");
       SingleLinkedList ssl= new SingleLinkedList();
       ssl.buatNode(mhs2);
       ssl.buatNode(mhs1);
       ssl.buatNode(mhs4);
        System.out.println("Dimasukkan data baru");
        ssl.sisip(mhs5, mhs2);
        System.out.println("");
        System.out.println("hapus di depan");
        ssl.hapusDidepan();
        System.out.println("hapus data");
        ssl.hapusData(mhs5);
       
       
    }
    
}
