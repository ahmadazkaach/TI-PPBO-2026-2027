public class produk {
    String namaproduk;
    double harga;

    public produk(String namaproduk,double harga){
        this.namaproduk=namaproduk;
        this.harga=harga;
    }
    public void tampilkandata(){
        System.out.println("Nama produk: "+this.namaproduk);
        System.out.println("Harga: "+this.harga);
    }
    public boolean ismahal(double batasharga) {
        return harga>batasharga;
    }
}
