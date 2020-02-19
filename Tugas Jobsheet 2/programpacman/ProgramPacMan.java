
package programpacman;
import java.util.Scanner;

public class ProgramPacMan {

   
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     PacMan p1 = new PacMan();
        System.out.print("Masukkan nilai x\t : " );
        p1.x=sc.nextInt();
        System.out.print("Masukkan nilai y\t : ");
        p1.y=sc.nextInt();
        System.out.print("Masukkan widht\t\t : ");
        p1.width=sc.nextInt();
        System.out.print("masukkan height\t\t : ");
        p1.height=sc.nextInt();
        
        p1.PrintPosition();
        
        
        
    }
    
}
