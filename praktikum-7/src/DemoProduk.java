public class DemoProduk {
    public static void main(String[] args) {

        Produk produk = new Produk("P001", "Laptop", 7500000, 10);

        System.out.println("Kode Produk: " + produk.getKodeProduk());
        System.out.println("Nama Produk: " + produk.getNamaProduk());
        System.out.println("Harga: " + produk.getHarga());
        System.out.println("Stok Awal: " + produk.getStok());

        // Menambah stok
        produk.tambahStok(5);
        System.out.println("Stok setelah ditambah: " + produk.getStok());

        // Mengurangi stok
        produk.kurangiStok(3);
        System.out.println("Stok setelah dikurangi: " + produk.getStok());
    }
}
