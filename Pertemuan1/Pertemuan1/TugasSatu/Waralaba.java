package TugasSatu;
import java.util.Scanner;

public class Waralaba {
        public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int menu, XA, XB, XC,YA,YB,YC,total=0,hitung=0;
        
        System.out.println("Paket :");
        System.out.println("1. paket chicken");
        System.out.println("2. paket oke");
        System.out.println("pilihan paket: ");
        menu = in.nextInt();
        switch (menu){
            case 1:
                XA = 12000;
                XB = 15000;
                XC = 20000;
               
                System.out.println("Chicken A =" + XA);
                System.out.println("Chicken B ="+ XB);
                System.out.println("Chicken C ="+ XC);
                total = XA + XB + XC;
                System.out.println("Total :"+total);
                break;
            case 2:
                YA = 10000;
                YB = 12000;
                YC = 15000;
                
                System.out.println("Oke A =" + YA);
                System.out.println("Oke B =" + YB);
                System.out.println("Oke C =" + YC);
                hitung = YA + YB + YC;
                System.out.println("total :" + hitung);
                
        }
    }

}
