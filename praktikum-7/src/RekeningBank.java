
public class RekeningBank {

    // Atribut private
    private String nomorRekening;
    private String pemilik;
    private String jenisRekening;
    private double saldo;

    // Constructor
    public RekeningBank(String nomor, String pemilik,
                        String jenisRekening, double saldoAwal) {

        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.jenisRekening = jenisRekening;

        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0;
        }
    }

    // Getter
    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getPemilik() {
        return pemilik;
    }

    public String getJenisRekening() {
        return jenisRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    // Method setor
    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Setor gagal! Jumlah harus positif.");
            return;
        }

        saldo += jumlah;
        System.out.println("Setor berhasil: Rp" + jumlah);
    }

    // Method tarik
    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Tarik gagal! Jumlah harus positif.");
            return;
        }

        if (jumlah > saldo) {
            System.out.println("Tarik gagal! Saldo tidak mencukupi.");
            return;
        }

        saldo -= jumlah;
        System.out.println("Tarik berhasil: Rp" + jumlah);
    }

    // Method transfer
    public void transferKe(RekeningBank tujuan, double jumlah) {

        if (tujuan == null) {
            System.out.println("Transfer gagal! Rekening tujuan tidak valid.");
            return;
        }

        if (jumlah <= 0) {
            System.out.println("Transfer gagal! Jumlah harus positif.");
            return;
        }

        if (jumlah > saldo) {
            System.out.println("Transfer gagal! Saldo tidak mencukupi.");
            return;
        }

        // Memindahkan saldo
        saldo -= jumlah;
        tujuan.saldo += jumlah;

        System.out.println("Transfer berhasil!");
        System.out.println("Dari    : " + pemilik);
        System.out.println("Ke      : " + tujuan.pemilik);
        System.out.println("Jumlah  : Rp" + jumlah);
    }

    // Method cetak mutasi
    public void cetakMutasi() {
        System.out.println("\n================================");
        System.out.println("       LAPORAN REKENING");
        System.out.println("================================");
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Pemilik        : " + pemilik);
        System.out.println("Jenis Rekening : " + jenisRekening);
        System.out.printf("Saldo Saat Ini : Rp%.2f%n", saldo);
        System.out.println("================================");
    }
}
