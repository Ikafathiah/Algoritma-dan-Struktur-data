
package bfdc;
import java.util.Scanner;

public class Faktorial {
    public int nilai;
    
    public int faktorialBF(int n){//O(1)
        int fakto = 1;//O(1)
        for (int i=1; 1<= n; i++){//O(n)
            fakto = fakto *i;//O(1)
        }
        return fakto;
    }
    public int faktorialDC(int n){
        if (n==1){//O(1)
            return 1;//O(1)
        }
        else {
            int fakto =n* faktorialDC(n-1);//O(1)
            return fakto;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.print("Masukkan jumlah elemen yang dihitung :");
        int elemen = sc.nextInt();
        
        Faktorial[] fk = new Faktorial[elemen];//O(1)
        for(int i =0; i< elemen; i++){//O(n)
            fk[i] = new Faktorial();//O(1)
            System.out.print("masukkan nilai data ke-"+(i+1)+" :");//O(1)
            fk[i].nilai = sc.nextInt();//O(1)
            
        }
        System.out.println("=======================================");
        System.out.println("Hasil faktorial dengan Brute force");
        for(int i=0; i<elemen; i++){//O(n)
            System.out.println("faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));//O(1)
        }
             System.out.println("=======================================");
        System.out.println("Hasil faktorial dengan Divide and Conquer");
        for( int i=0; i<elemen; i++){//O(n)
            System.out.println("faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));//O(1)
            
        }
            System.out.println("========================================");
        
    }
    //Notasi Big O
    //O(1+1+n*1+1+1+1+1+n*1*1*1+n*1+n*1)
    //O(2+n+4+n+n+n)
    //O(6+4n)
    //O(4n)
    //O(n)
}
