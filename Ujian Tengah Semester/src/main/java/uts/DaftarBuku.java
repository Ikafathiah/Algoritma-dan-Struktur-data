/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author ikafa
 */
public class DaftarBuku {
  Buku listBuku[]=new Buku[4];
int idx; 
void tampil(){
     for(Buku b : listBuku){
         b.tampil();
         System.out.println("-------------------");
     }
     
 }
void tambah(Buku b){
     if(idx<listBuku.length){
         listBuku[idx]=b;
         idx++;
     } else{
         System.out.println("Data sudah penuh");
     }
 }
void bubbleShort(){
     for(int i=0; i<listBuku.length-1; i++){
         for(int j=1; j<listBuku.length-i; j++){
         if(listBuku[j].tinggiBuku>listBuku[j-1].tinggiBuku){
             Buku tmp = listBuku[j];
             listBuku[j]= listBuku[j-1];
             listBuku[j-1]=tmp;
         }
     }
     }
}
public int search(double b[], int dicari, int a, int lo, int hi){
    int i, mid;
    while(lo<=hi){
       mid=(lo+hi)/2;
       if(dicari==b[mid]){
           return mid;
       }else if(dicari<b[mid]){
           hi=mid-1;
       }else{
           lo=mid+1;
       }
    }
    return -1;
}
}
