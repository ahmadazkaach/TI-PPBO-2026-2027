public class cekproduk {
    public static void main(String[] args) {
        produk p1 = new produk("jam tangan",50000);
        p1.tampilkandata();
        System.out.println("mahal?"+p1.ismahal(8000));

    }
}
