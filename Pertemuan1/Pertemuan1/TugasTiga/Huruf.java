package TugasTiga;

public class Huruf {
    public static void main(String[] args) {

char[] Huruf = {'m', 'i', 's', 's', 'i', 's', 's', 'i', 'p', 'i'};	   
int M = 0; 
int I =0; 
int S=0; 
int P=0;

for (int i=0; i<Huruf.length; i++) {	      
    if (Huruf[i] == 'm') M++;
}	   
System.out.println("Jumlah huruf m : "+ M);

for (int j=0; j<Huruf.length; j++) {	      
    if (Huruf[j] == 'i') I++;
}	   
System.out.println("Jumlah huruf i : "+ I);

for (int k=0; k<Huruf.length; k++) {	      
    if (Huruf[k] == 's') S++;
}	   
System.out.println("Jumlah huruf s : "+ S);

for (int l=0; l<Huruf.length; l++) {	      
    if (Huruf[l] == 'p') P++;
}	   
System.out.println("Jumlah huruf p : "+ P);
    }
    
}

