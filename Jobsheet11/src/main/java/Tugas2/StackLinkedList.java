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
public class StackLinkedList {
    protected Node head;
    protected int number;
    public StackLinkedList(){
        head=null;
        number=0;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public int size(){
        return number;
    }
    public void insert(Object obj){
        head= new Node(obj,head);
        number++;
    }
    public Object remove(){
        if(isEmpty()){
            return null;
            Node tmp= head;
            head=tmp.getNext();
            number--;
            return tmp.getData();
        }
          
    }
    public Object peek(int n){
        Node t= head;
        for (int i = 0; i < n&&t!=null; i++) {
            t=t.getNext();
            return t.getData();
        }
       
    }
   
    
}