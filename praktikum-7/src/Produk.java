public class Produk {

    // Atribut private
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    // Constructor
    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        setHarga(harga);
        this.stok = stok;
    }

    // Getter
    public String getKodeProduk() {
        return kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Setter
    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public void setHarga(double harga) {
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif!");
        }
        this.harga = harga;
    }

    public void setStok(int stok) {
        if (stok < 0) {
            throw new IllegalArgumentException("Stok tidak boleh negatif!");
        }
        this.stok = stok;
    }

    // Method tambah stok
    public void tambahStok(int jumlah) {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah harus positif!");
        }

        stok += jumlah;
    }

    // Method kurangi stok
    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah harus positif!");
        }

        if (jumlah > stok) {
            throw new IllegalArgumentException("Stok tidak mencukupi!");
        }

        stok -= jumlah;
    }
}