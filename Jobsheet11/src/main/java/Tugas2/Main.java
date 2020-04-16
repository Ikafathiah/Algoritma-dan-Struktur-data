/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author ikafa
 */
public class Main {
    public static void main(String[] args) {
        Scanner MyScanner= new Scanner(System.in);
        StackLinkedList l= new StackLinkedList();
        int y=0;
        int i=1;
        int x=0;
        do{
            String star= JOptionPane.showInputDialog("Masukkan pilihan anda!!!\n1.masukkan data \n2.lihat data \n3.hapus data \n4.keluar");
            y=Integer.parseInt(star);
            if(y==1){
                System.out.println("angka"+i+"=");
                x=MyScanner.nextInt();
                l.insert(x);
                i++;
                System.out.println();
            }
            if(y==2){
                if(l.isEmpty()){
                    System.out.println("Data kosong");
                }else{
                    for ( i = 0; i < l.size(); i++) {
                        System.out.println("data"+(i+1)+":"+l.peek(i));
                    }
                }
                System.out.println();
            }
            if(y==3){
               if(l.isEmpty()){
                   System.out.println("Data kosong");
               } 
               else{
                   System.out.println("data"+((Integer)l.remove())+"keluar");
                   System.out.println();
               }
            }
            if(y !=1&& y!=2&& y!=3&& y!=4){
                jOptionPane.showMessageDialog(null,"msukkan pilihan yang tersedia!!!")
                        
            }
                
        }
        while (y!=4);
        }
}
    
    
    


      
