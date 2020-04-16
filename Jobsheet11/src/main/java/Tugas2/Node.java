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
public class Node {
   protected Object data;
   protected Node next;
   
   public Node(){
       next=null;
       data=null;
   }
   public Node(Object d, Node n){
       data=d;
       next=n;
   }
   public void setNext(Node n){
       next=n;
   }
   public void setData(Object d){
       data=d;
   }
   public Node getNext(){
       return next;
   }
   public Object getData(){
       return data;
   }
}
