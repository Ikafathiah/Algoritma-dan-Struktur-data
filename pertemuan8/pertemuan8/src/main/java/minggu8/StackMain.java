
package minggu8;
import java.util.Scanner;
/**
 *
 * @author ikafa
 */
public class StackMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        Stack tumpukan = new Stack(6);
        tumpukan.push(15);
        tumpukan.push(31);
        tumpukan.push(9);
        tumpukan.push(12);
        tumpukan.push(17);
        tumpukan.push(98);
        
        
        
        tumpukan.print();
        
        
        tumpukan.pop();
        
        tumpukan.peek();
        
        tumpukan.print();
        
        
        
        
    }
}
