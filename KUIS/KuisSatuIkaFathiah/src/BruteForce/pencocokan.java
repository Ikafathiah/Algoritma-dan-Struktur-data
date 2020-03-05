
package BruteForce;

/**
 *
 * @author ikafa
 */
public class pencocokan {

    private static void match(int[] Teks, int[] pola) {
        
        
    }

    
  
       
    
   public int n,m;
   public String Teks,pola;
 public int bruteforce( int Teks[], int pola[]){
  
       
     for(int i=0; i<n; i++){
        int j=0;
             while(pola[j]==Teks[i+j]&&j<m){
                  
             
             j++;
             System.out.println("Data Cocok");
         }
             if(j==m){
                 return i;
                 
             }
               System.out.println("Data Tidak Cocok");  
             
         
     }
     return -1;
 }
 

 
    public static void main(String[] args) {
        int[] pola={'N','G','A'};
        int[] Teks={'S','E','M','A','N','G','A','T'};
        match(Teks,pola);
    

      
        
    }
 
     
 
   
}
