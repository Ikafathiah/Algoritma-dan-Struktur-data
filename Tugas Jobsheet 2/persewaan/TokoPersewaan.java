
package persewaan;

public class TokoPersewaan {
    public int id, hari, harga;
    public String nama, game;
    
    TokoPersewaan(){
        
    }
    public void DataHasilPinjaman(){
        System.out.println("Id\t\t : "+id);
        System.out.println("Nama member\t : "+nama);
        System.out.println("Nama game\t : "+game);
        System.out.println("Lama pinjam\t : "+hari +" hari");
        System.out.println("Harga\t\t : "+harga);
        
    }
    public int Bayar(){
        return harga*hari;
        
    }
}

