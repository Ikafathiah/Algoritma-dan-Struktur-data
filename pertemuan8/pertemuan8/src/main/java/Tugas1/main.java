/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
import java.util.Scanner;
/**
 *
 * @author ikafa
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan kalimat\t");
        String kalimat = sc.nextLine();
        String kata[]= kalimat.split("\\s+");
        tugas1 tg = new tugas1(kata.length);
        
        for (int i = 0; i < kata.length; i++) {
            tg.push(kata[i]);
        }
        tg.print();
        tg.pop();
        tg.peek();
        tg.print();
    }
  
}
