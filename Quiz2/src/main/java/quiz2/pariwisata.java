/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;
import java.util.Scanner;
/**
 *
 * @author ikafa
 */
public class pariwisata {
   int bulan, tahun2018, tahun2019, tahun2020;
   pariwisata next;
   public static Scanner in= new Scanner(System.in);
   
   public void input(){
       System.out.print("Masukkan bulan :");
       bulan=in.nextInt();
       System.out.println("Masukkan data tahun 2018 :");
       tahun2018=in.nextInt();
       System.out.println("Masukkan data tahun 2019 :");
       tahun2019=in.nextInt();
       System.out.println("Masukkan data tahun 2020 :");
       tahun2020=in.nextInt();
       next=null;
   }
   public void view(){
       System.out.println("| "+bulan+" |"+tahun2018+" |"+tahun2019+" |"+tahun2020+" |");
   }
   
    public static void main(String[] args) {
        int menu=0,del;
        linkedlist ll=new linkedlist();
        
        while(menu!=4){
            System.out.println("1.Input\n2.View\n3.Delete\n4.Exit\n :");
            menu=in.nextInt();
            if(menu==1) ll.add();
            else if(menu==2) ll.view();
            else if(menu==3){
                System.out.println("1.Data pertama\n2.Data terakhir\n :");
                del=in.nextInt();
                if(del==1) ll.removeFirst();
                else if(del==2) ll.removeLast();
                else
                    System.out.println("Salah");
                
            }
            else if(menu==4)
                System.out.println("Keluar");
                
            
            else
                System.out.println("Salah");
            System.out.println();
        }
    }
    class linkedlist{
      pariwisata head, tail;
      public void linkedlist(){
        head=null;
        tail=null;
        
      }
      public void add(){
          pariwisata baru=new pariwisata();
          baru.input();
          if(head==null) head=baru;
          else tail.next=baru;
          tail=baru;
      }
      public void view(){
          if(head==null){
              System.out.println("kosong");
              return;
          }
          System.out.println("| bulan | 2018 | 2019 | 2020 |");
          pariwisata par=head;
          while(par!=null){
              par.view();
              par=par.next;
          }
                  
      }
      public void removeFirst(){
          if(head==null){
              System.out.println("kosong");
              return;
          
          }
          System.out.println("Data "+head.tahun2018+" berhasil dihapus");
          head=head.next;
          
      }
      public void removeLast(){
          if(head==null){
              System.out.println("Kosong");
              return;
              
          }
          System.out.println("Data "+tail.tahun2018+" berhasil dihapus");
          if(head==tail){
              head=null;
              tail=null;
          }else{
              pariwisata par=head.next;
              pariwisata prev=head;
              while(par!=tail){
                  par=par.next;
                  prev=prev.next;
              }
              prev.next=null;
              tail=prev;
          }
      }
   }
}
