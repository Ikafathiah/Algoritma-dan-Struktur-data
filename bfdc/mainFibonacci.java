
package bfdc;
import java.util.Scanner;
/**
 *
 * @author ikafa
 */

public class mainFibonacci {
    static int fb(int n){
if(n==0||n==1){//O(1)
    return n;
}else{
    return(fb(n-1)+fb(n-2));//O(1)
}
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//O(1)
        System.out.println("Brute Force");//O(1)
        int n;
        System.out.print("Masukkan deret Fibonacci");
        n= sc.nextInt();//O(1)
        int fb[]= new int[n];//O(1)
        fb[0]=0;//O(1)
        fb[1]=1;//O(1)
        for(int i=2;i<n;i++){//O(n)
            fb[i]=fb[i-1]+fb[i-2];//O(1)
        }
        for(int i=0;i<n;i++){//O(n)
            System.out.println("Fibonacci ke-"+i+":"+fb[i]);//O(1)
        }
        System.out.println("Devide Conquer");
        int i, j=0;//O(1)
        System.out.println("Masukkan deret Fibonacci : ");
        n= sc.nextInt();
        System.out.println("Hasil bilangan Fibonacci");
        System.out.println("");
        for(i=1;i<=n;i++){//O(n)
            System.out.println("Fibonacci ke-"+i+":"+fb(j));//O(1)
            j++;//O(1)
        }
        System.out.println();
       //Notasi Big O 
       //O(1+1+1+1+1+1+1+1+n*1+n*1+1+1+1+1)
       //O(8+n+n+4)
       //O(12+2n)
       //O(n)
       
        
    }
}