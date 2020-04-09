/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author ikafa
 */
public class nasabah {
  
    String noRekening;
    String nama;
    
    public nasabah(String noRek, String nm) { 
        noRekening = noRek;
        nama = nm;
    }
    
    void print(){
        System.out.println("Nama Nasabah : " + nama);
        System.out.println("Nomor Rekening : " + noRekening);
    }
}  

