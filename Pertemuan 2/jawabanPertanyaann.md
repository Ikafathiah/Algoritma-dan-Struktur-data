# jawaban 2.3.3

1. Karakteristik Class dan Objek
Class : diawali dengan huruf kapital
Objek : harus instansiasi di method main
2. kata kunci unruk mendeklarasikan class adalah kata class kemudian nama class
3. ada 4 atribut yaitu : namaBarang, jenisbarang, stok, dan hargaSatuan. Dideklarasikan pada baris ke 2 dan 3.
4. ada 4 method yaitu tampilBarang, tambahStok, kurangStok, dan hitungHargaTotal. ada di baris ke 5, 12, 15, 18
5. public void kurangStok (int n){
        if (stok>0){
            
        
        stok= stok - n;
        }
        else{
            System.out.println("stok kosong");
        }
6. karena untuk menambahkan jumlah stok
7. karena method hitung harga total mengambil nilai dari harga dan jumlah yang bertipe int
8. karena tidak membutuhkan pengembalian nilai


# 2.4.3

1. pada baris ke 3. nama objek yangdihasilkan adalah b1
2. dengan cara menulis nama objek kemudian dilanjutkan dengan nama atribut.

# 2.5.3

1. pada baris 7
2. menginstansiasi objek barang dengan objek b2 dan  mengisi nilai dari instansiasi
3. Barang b3 = new Barang("nokia","hp",500000,12);
       b3.tampilBarang();

# 2.6.3

1. mendeklarasikan array persegi panjang
2. mengisi index array[1] dengan atribut yang telah dideklarasikan

# 2.7.3

1.karena Array[5] belum diinstansiasi

# 2.8.3

1. konstruktor adalah method yang memiliki nama yang sama dengan class yang berfungsi untuk memanggil nilai yang ada di main
2. Segitiga[] sgArray = new segitiga[15];
3. public segitiga1 (int a,int t){
        alas = a;
        tinggi =t;
    }
4.  public double hitungKeliling(){
        double c = alas*alas + tinggi*tinggi;
        return alas + tinggi + Math.sqrt(c);
    }
    public double hitungLuas(){
        return (alas*tinggi)/2;
    }
5.  segitiga1[] sgArray = new segitiga1[4];
        sgArray[0]=new segitiga1(10,4);
        sgArray[1]=new segitiga1(20,10);
        sgArray[2]=new segitiga1(15,6);
        sgArray[3]=new segitiga1(25,10);
        
        for (int i=0; i< 4; i++){
            System.out.println("Keliling ke-"+i+" : " + sgArray[i].hitungKeliling());
            System.out.println("Luas ke-"+i+" : "+sgArray[i].hitungLuas());
            
        }
        
