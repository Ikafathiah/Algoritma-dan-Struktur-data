/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author ikafa
 */
public class tugas2 {
    int size, top;
    String data[];
   
    public tugas2(){
        
    }
    public tugas2(int size){
        this.size=size;
        data= new String[size];
        top=-1;
    }
    public boolean IsEmpty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean IsFull(){
        if(top==size-1){
            return true;
        }else{
            return false;
        }
    }
    public void push(String dt){
        if(!IsFull()){
            top++;
            data[top]=dt;
        }else{
            System.out.println("Isi stuck penuh");
        }
    }
    public void pop(){
        if(!IsEmpty()){
            String x= data[top];
            top--;
            System.out.println("\nData yang keluar\t : "+x);
        }else{
            System.out.println("Stuck masih kosong ");
        }
        
    }
    public void peek(){
        System.out.println("\nElemen teratas\t\t : "+data[top]);
    }
    public void print(){
        System.out.println("\nKalimat dibalik\t\t: ");
        for (int i = top; i >=0 ; i--) {
            System.out.println(data[i]+" ");
            
        }
        System.out.println();
        
    }
    public void clear(){
        if(!IsEmpty()){
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}
