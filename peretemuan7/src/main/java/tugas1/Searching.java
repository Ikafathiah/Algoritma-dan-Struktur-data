
package tugas1;

/**
 *
 * @author ikafa
 */
public class Searching {
  public int[] data;
public int jumlahData;

public Searching(int[] Data, int jmlData){
  this.jumlahData= jmlData;  
  data = new int[jmlData];
    for (int i = 0; i < jumlahData; i++) {
        data[i]= Data[i];
        
    }
}
public int TemukanSequentialSearch(int cariData){
    int posisi=-1;
    for (int j = 0; j < jumlahData; j++) {
        if (data[j]==cariData){
            posisi=j;
            break;
        }   
        
    }
    return posisi;
}
public void TampilData(){
    for (int i = 0; i < jumlahData; i++) {
        System.out.println(data[i]+" ");
        
    }
    System.out.println();
}
public int TemukanBinarySearch(int cariData, int data[],int left, int right){
  int mid;
if(right>=left){
    mid=(left+right)/2;
    if(cariData==data[mid]){
        return(mid);
    }else if(data[mid]>cariData){
        return TemukanBinarySearch(cariData, data, left, mid-1);
    }else{
        return TemukanBinarySearch(cariData, data, mid+1, right);
    }
}  
return -1;
}
public void TampilPosisi(int a, int pos){
    if(pos != -1){
        System.out.println("data : "+a+" ditemukan pada indeks ke-"+pos);
    }else{
        System.out.println("data "+a+"tidak ditemukan");
    }
}



}
