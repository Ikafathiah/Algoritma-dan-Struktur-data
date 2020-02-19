package programlingkaran;

public class Programlingkaran {
    public static void main(String[] args) {
        Lingkaran lng = new Lingkaran();
        lng.r = 14;
        
        System.out.println("Jari - jari : " + lng.r);
        System.out.println("Luas : " + lng.hitungLuas());
        System.out.println("Keliling : " + lng.hitungKeliling());
    }
}
