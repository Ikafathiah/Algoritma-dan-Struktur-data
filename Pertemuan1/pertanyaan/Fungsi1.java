package pertanyaan;

public class Fungsi1 {
    public static void main(String[] args) {
        
        System.out.println("Menggunakan Fungsi Rekursif");
        int n = 9;
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i)+" | ");
        }
   
        
        System.out.println("-----------------------------------------------------");
        
        System.out.println("Menggunakan Fungsi Perulangan");
        int a=0, b=1, c;
        for (int i = 0; i < n; i++) {
            c = a + b;
            System.out.print(a + " | ");
            a=b;
            b=c;
        }
        
        System.out.println("-----------------------------------------------------");
        
    } 

    static int fibo(int i){
        if (i == 0){
            return 0;
        } else if (i <= 2){
            return 1;
        } else {
            return fibo(i-1) + fibo(i-2);
        }
    }
}
