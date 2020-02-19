
package programjajargenjang;


public class JajarGenjang {
public int tinggi, panjang, sisiMiring;

JajarGenjang(){
    
}
public int hitungLuas(){
    return panjang*tinggi;
    
}
public int hitungKeliling(){
    return 2*(panjang+sisiMiring);
    
}
}
