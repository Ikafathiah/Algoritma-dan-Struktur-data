/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlists;

/**
 *
 * @author ikafa
 */
public class Doublelinkedlistsmain {
    public static void main(String[] args) throws Exception {
        Doublelinkedlists dll= new Doublelinkedlists();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==================================");
        dll.clear();
        dll.print();
        System.out.println("size : "+dll.size());
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("==================================");
        System.out.println("data awal pada linked list adalah: "+dll.getFirst());
        System.out.println("data akhir pada linked list adalah: "+dll.getLast());
        System.out.println("data index ke-1 pada linked list adalah: "+dll.get(1));
    }
  
}
