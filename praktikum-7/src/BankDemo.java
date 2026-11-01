
public class BankDemo {
    public static void main(String[] args) {

        // Membuat dua objek rekening
        RekeningBank rek1 = new RekeningBank(
                "001", "Budi", "Tabungan", 100000
        );

        RekeningBank rek2 = new RekeningBank(
                "002", "Andi", "Giro", 50000
        );

        // Menampilkan saldo awal
        System.out.println("=== SALDO AWAL ===");
        rek1.cetakMutasi();
        rek2.cetakMutasi();

        // SETOR pada masing-masing rekening
        System.out.println("\n=== TRANSAKSI SETOR ===");
        rek1.setor(20000);
        rek2.setor(10000);

        // TARIK pada masing-masing rekening
        System.out.println("\n=== TRANSAKSI TARIK ===");
        rek1.tarik(30000);
        rek2.tarik(5000);

        // Transfer berhasil
        System.out.println("\n=== TRANSFER BERHASIL ===");
        rek1.transferKe(rek2, 25000);

        // Transfer gagal karena saldo tidak cukup
        System.out.println("\n=== TRANSFER GAGAL ===");
        rek1.transferKe(rek2, 100000);

        // Menampilkan mutasi akhir kedua rekening
        System.out.println("\n=== MUTASI AKHIR ===");
        rek1.cetakMutasi();
        rek2.cetakMutasi();
    }
}
