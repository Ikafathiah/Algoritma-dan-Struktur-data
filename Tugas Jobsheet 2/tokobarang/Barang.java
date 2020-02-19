
package tokobarang;


public class Barang {
    public int hargaSatuan, jumlah;
    public String nama;
    
    Barang(){
        
    }
    public int hitungHargaTotal(){
        return jumlah * hargaSatuan;
        
    }
    public int hitungDiskon(){
        if (hitungHargaTotal()>100000) {
            jumlah = hitungHargaTotal() * 10/100;
        }
            else if (hitungHargaTotal()>=50000) {
            jumlah =hitungHargaTotal()* 5/100;
            }
            else{
            jumlah =hitungHargaTotal();
                    }
        return jumlah;
            
            
       
        
    }
    public int hitungHargaBayar(){
        return hitungHargaTotal() - hitungDiskon();
        
    }
}
