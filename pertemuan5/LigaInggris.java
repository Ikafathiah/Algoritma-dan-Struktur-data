/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

public class LigaInggris {
    public String namaClub;
    public int poin;
    public int pertandingan;
    public int goal;
    
    public LigaInggris(){
        
    }
    
    public LigaInggris(String nc, int pn, int pr, int g){
        namaClub = nc;
        poin = pn;
        pertandingan = pr;
        goal = g;
    }
    
    public void tampil(){
        System.out.println("=============== Premier League ===============");
        System.out.println("Nama Club Liga Inggris\t: " + namaClub);
        System.out.println("Jumlah Pertandingan\t: " + pertandingan);
        System.out.println("Goal Difference\t\t: " + goal);
        System.out.println("Poin Pertandingan\t: " + poin);
    }
}
