public class TokoDemo {
    public static void main(String[] args) {
        //array berisi lima produk
        produk_t[] daftar = new produk_t[5];
        daftar[0] =new produk_t("k001","keyboard",200000,10);
        daftar[1] =new produk_t("b002","mouse",150000,8);
        daftar[2] =new produk_t("f001","flashdisk",850000,7);
        daftar[3] =new produk_t("h001","headset",100000,10);
        daftar[4] =new produk_t("m001","monitor",150000,15);

        for (produk_t p : daftar) {
            p.tampilkandata();
        }
        //skenario mencukupi
        System.out.println("pembelian pertama: ");
        System.out.println("produk :"+daftar[0] .namaProduk);
        System.out.println("jumlah beli : 3");
        System.out.println("total harga: "+daftar[0].totalharga(3));
        daftar[0].kurangistok(3);
        System.out.println("-------------");
        //skenario tidak mencukupi
        System.out.println("pembelian kedua: ");
        System.out.println("produk :"+daftar[0].namaProduk);
        System.out.println("jumlah beli : 10");
        System.out.println("total harga: "+daftar[0].totalharga(10));
        daftar[0].kurangistok(10);
        System.out.println("-------------");

        produk_t termahal = daftar[0];
        for (produk_t p : daftar) {
            if (p.harga > termahal.harga) {
                termahal = p;
            }
        }
        System.out.println("produk termahal adalah: ");
        termahal.tampilkandata();
    }
}