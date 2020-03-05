public class GelangTower {
    static void towerOfHanoi(int n, char dari, char ke, char sementara) 
    { 
        if (n == 1) 
        { 
            System.out.println("pindah 1 gelang dari tower " +  dari + " ke tower " + ke); 
            return; 
        } 
        towerOfHanoi(n-1, dari, sementara, ke); 
        System.out.println("pindah gelang " + n + " dari tower " + dari + " ke tower " + ke); 
        towerOfHanoi(n-1, sementara, ke, dari); 
    } 
      
  
    public static void main(String args[]) 
    { 
        int n = 4; 
        towerOfHanoi(n, 'A', 'C', 'B'); 
    } 
}