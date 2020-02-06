package Tugaslima;

import java.util.Scanner;

public class LuasBangun {
    public int alas, tinggi, sisi,jari2;
    public int LuasSegitiga(){
        int luas = (int)(0.5 * alas * tinggi);
        return luas;
    }
        
    public int LuasSegiEmpat(){
       int luas = (sisi * sisi);     
       return luas;
    }
        
        
    public double LuasLingkaran(){          
        double luas = (3.14 * jari2 * jari2);
        return luas;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        LuasBangun luas = new LuasBangun();
        int bangun;   
        
       
        System.out.println("1. Luas Segitiga");
        System.out.println("2. Luas Segiempat");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Menu");
        System.out.println("pilih bangun ruang :");
        bangun = sc.nextInt();
        switch (bangun){
            case 1:
                System.out.println("Alas =");
                luas.alas = sc.nextInt();
                System.out.println("tinggi =");
                luas.tinggi = sc.nextInt();
                System.out.println("Luas Segitiga =" + luas.LuasSegitiga() );
                break;
            case 2:
                System.out.println("Sisi =");
                luas.sisi = sc.nextInt();
                System.out.println("Luas Segiempat =" + luas.LuasSegiEmpat());
                break;
            case 3:
                System.out.println("Jari-Jari =");
                luas.jari2 = sc.nextInt();
                System.out.println("Luas Lingkaran =" + luas.LuasLingkaran());
                break;
            case 4:
                System.out.println("Menu");
                break;
            
        }
    }
}
