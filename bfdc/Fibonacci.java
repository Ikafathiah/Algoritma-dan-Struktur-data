
package bfdc;

/**
 *
 * @author ikafa
 */
public class Fibonacci {
    public int FibonacciBF(int a){
        if (a<=1){
            return a;
        }
        else{
            return FibonacciBF(a-1)+FibonacciBF(a-2);
            
        }
    }
    public int FibonacciDC(int a){
        int Fi[];
        Fi = new int[a+2];
        Fi[0]=0;
        Fi[1]=1;
        for (int i = 0; i < a; i++) {
            Fi[i]=Fi[i-1]+Fi[i-2];
            
            
        }
        return Fi[(int)a];
    }
}
