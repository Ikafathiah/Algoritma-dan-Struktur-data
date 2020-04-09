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
public class queue {
     int max, front, size, rear;
    nasabah[] q;
    
    public queue(int m) {
        max = m;
        create();
    }
    
    void create(){
        q = new nasabah [max];
        size = 0;
        front = rear = -1;
    }
    
    boolean isEmpty(){
        if (size == 0)
            return true;
        else
            return false;
    }

    boolean isFull(){
        if(size == max)
            return true;
        else
            return false;
    }
    
    void enqueue(nasabah nas){
        if(isFull()){
            System.out.println("Antrian sudah penuh!!"); }else{
            if (isEmpty()){
                front = rear = 0;
            }else{
                if(rear == max-1){
                    rear = 0;
                }else {
                    rear++;
                }
            }
            q[rear] = nas;
            size++;
        }
    }
    
    nasabah dequeue(){
        nasabah nas = null;
        if(isEmpty()){
            System.out.println("Antrian Kosong!"); 
        }
        else{
            nas = q[front];
            size--;
            if(isEmpty()){
                front = rear = -1;
            }
            else{
                if(front == max -1){
                    front = 0;
                }
                else{
                    front++;
                }
            }
        }
        return nas;
    }
    
    void print(){
        if(isEmpty()){
            System.out.println("Antrian kosong!");
        }
        else{
            int i = front;
            while(i!=rear){
                System.out.println(q[i].nama +" "+ q[i].noRekening); i = (i+1)%max;
            }
            System.out.println(q[i].nama + " " + q[i].noRekening); System.out.println("Jumlah Antrian = " + size);
        }
    }
    
    void printFront(){
        int i = front;
        System.out.println("Front Data is : " + q[i].nama + " " + q[i].noRekening);
    }
    
    void printRear(){
        int i = rear;
        System.out.println("Rear Data is : " + q[i].nama + " " + q[i].noRekening);
    }
    
    void printPosition(String data){
        int count =0;
        if(isEmpty()){
            System.out.println("Antrian kosong!"); }else{
            int i = front;
            while(i!=rear){
                count++;
                if (data.equalsIgnoreCase(q[i].nama)){
                    System.out.println("Data berada dalam Posisi: " +
                            count);
                    break;
                }
                i = (i+1)%max;
            }
            System.out.println(q[i].nama + " " + q[i].noRekening);
        }
    }
    
    void printNasabah(int posisi){
        int count =0;
        if(isEmpty()){
            System.out.println("Antrian kosong!"); }
        else{
            int i = front;
            while(i!=rear){
                count++;
                if (posisi == count){
                    System.out.println("Posisi ke -" + (i+1) + " : " + q[i].nama + " " + q[i].noRekening);
                    break;
                }
                i = (i+1)%max;
            }
            System.out.println(q[i].nama + " " + q[i].noRekening);
        }
    }
 
}
