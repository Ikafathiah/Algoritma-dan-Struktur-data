/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author ikafa
 */
public class tugas1 {
int size, top;
String data[];
public tugas1(){
    
}
public tugas1(int size){
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
    if(IsEmpty()){
        String x= data[top];
        top--;
        System.out.println("\nData yang keluar : "+x);
    }else{
        System.out.println("Stuck masih kosong");
    }
}
public void peek(){
    System.out.println("\nElemen teratas "+data[top]);
}
public void print(){
    System.out.println("\nIsi stack: ");
    for (int i = top; i >= 0; i--) {
        System.out.println(data[i]);
        
    }
}
public void clear(){
    if(!IsEmpty()){
        for (int i = top; i >= 0; i--) {
            top--;
            
        }
        System.out.println("Stuck sudah dikosongkan");
    }else{
        System.out.println("Gagal! Stuck masih kosong");
    }
}
}
