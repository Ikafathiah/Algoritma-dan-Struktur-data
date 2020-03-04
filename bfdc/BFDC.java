
package bfdc;


import java.util.Scanner;

/**
 *
 * @author ikafa
 */
public class BFDC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      minMax[] ppArray = new minMax[5];//O(1)
        Maxmin m = new Maxmin();//O(1)
      ppArray[0] = new minMax();//O(1)
      int min = ppArray[0].nilaiArray;//O(1)
      int max = ppArray[0].nilaiArray;//O(1)
      Scanner sc = new Scanner(System.in);//O(1)
      
      for (int i=0; i<5; i++){//O(n)
          ppArray[i] = new minMax();//O(1)
          System.out.println("Nilai array indeks ke-"+i);//O(1)
          System.out.print("Masukkan nilai: ");//O(1)
          ppArray[i].nilaiArray = sc.nextInt();//O(1)
    }
      for(int i=0; i<5; i++){//O(n)
          if (ppArray[i].nilaiArray<min){//O(1)
              min = ppArray[i].nilaiArray;//O(1)
          }
          else if (ppArray[i].nilaiArray>max){//O(1)
              max = ppArray[i].nilaiArray;//O(1)
          }
      }
        System.out.println("Brute force");//O(1)
        System.out.println("Nilai minimal : "+min);//O(1)
        System.out.println("Nilai maksimal : "+max);//O(1)
        
       int arr[] =new int[5];//O(1)
       for(int i=0;i<5;i++){//O(n)
           arr[i]=ppArray[i].nilaiArray;//O(1)
       }
       Maxmin hasil = new Maxmin();//O(1)
       
       Maxmin.max_min(arr,0,4,hasil);//O(1)
        System.out.println("Divide Conquer");//O(1)
        System.out.println("Nilai minimal: "+hasil.minimum+"\nNilai Maksimal: "+hasil.maximum);//O(1)
        System.out.println("\n");//O(1)
        //Notasi = O (1+1+1+1+1+1+n*1*1*1*1+n*1*1*1*1+1+1+1+1+n*1+1+1+1+1+1)
}       //       = O (6+n+n+n+6)
        //       = O (12+3n)
        //       = O (3n)
        //       = O (n)
    
}
