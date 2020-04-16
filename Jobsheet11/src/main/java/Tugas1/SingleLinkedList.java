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
public class SingleLinkedList {
  class Node{
    Object data;
    String alamat;
    Node next;
}
    private Node pointer;
    public SingleLinkedList(){
        pointer=null;
    }
    public void buatNode(Mahasiswa dt){
        Node nodeBaru = new Node();
        nodeBaru.data=dt;
        nodeBaru.alamat=dt.getalamat();
        nodeBaru.next=pointer;
        pointer=nodeBaru;
    }
    public boolean sisip(Mahasiswa dt1, Mahasiswa dt2){
        Node n=pointer;
        while((n != null)&&(n.data !=dt2)){
            n= n.next;
        }
        if(n==null){
            return false;
        }
        Node nn= new Node();
        nn.data=dt1;
        nn.next=n.next;
        n.next=nn;
        return true;
    }
    public Object hapusDidepan(){
        Node hapus=pointer;
        pointer=pointer.next;
        return hapus.data;
    }
    public void sisipDataDiakhir(Mahasiswa data){
        Node pSblAkhir = null, pAkhir;
        pAkhir=null;
        pAkhir=pointer;
        Node baru= new Node();
        baru.data=data;
        baru.next= null;
        while(pAkhir !=null){
            pSblAkhir= pAkhir;
            pAkhir=pAkhir.next;
        }
        pSblAkhir.next= baru;
    }
    public void hapusData(Mahasiswa dataHapus){
        Node n= pointer;
        while((n != null)&&(n.next.data !=dataHapus)){
            n=n.next;
        }
        n.next=n.next.next;
    }
    public Node getPointer(){
        return pointer;
    }
   
}

 

