import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Konstanta tarif listrik per kWh
        final double TARIF_450 = 415;
        final double TARIF_900 = 605;
        final double TARIF_1300 = 1444;
        final double TARIF_2200 = 1444;
        final double TARIF_DI_ATAS_2200 = 1700;

        // Membaca input golongan daya listrik
        System.out.print("Masukkan golongan daya (VA): ");
        int daya = input.nextInt();

        // Membaca input jumlah pemakaian listrik
        System.out.print("Masukkan pemakaian listrik (kWh): ");
        double kwh = input.nextDouble();

        // Validasi input menggunakan operator logika OR
        // Program menolak kWh nol atau negatif
        // Program juga menolak golongan daya yang tidak valid
        if (kwh <= 0 || !(daya == 450 || daya == 900 ||
                daya == 1300 || daya == 2200 || daya > 2200)) {

            // Menampilkan pesan error jika input tidak valid
            System.out.println("Error: Input tidak valid!");

        } else {
            // Variabel untuk menyimpan tarif listrik
            double tarif = 0;

            // Menentukan tarif berdasarkan golongan daya
            switch (daya) {

                // Jika daya 450 VA
                case 450:
                    tarif = TARIF_450;
                    break;

                // Jika daya 900 VA
                case 900:
                    tarif = TARIF_900;
                    break;

                // Jika daya 1300 VA
                case 1300:
                    tarif = TARIF_1300;
                    break;

                // Jika daya 2200 VA
                case 2200:
                    tarif = TARIF_2200;
                    break;

                // Jika daya di atas 2200 VA
                default:
                    tarif = TARIF_DI_ATAS_2200;
                    break;
            }

            // Menghitung total tagihan listrik
            double total = kwh * tarif;

            // Menampilkan hasil tagihan secara rapi
            System.out.println("\n===== TAGIHAN LISTRIK =====");

            // Menampilkan golongan daya
            System.out.println("Golongan Daya : " + daya + " VA");

            // Menampilkan jumlah pemakaian listrik
            System.out.printf("Pemakaian     : %.2f kWh%n", kwh);

            // Menampilkan tarif per kWh
            System.out.printf("Tarif per kWh : Rp%.0f%n", tarif);

            // Menampilkan total tagihan
            System.out.printf("Total Tagihan : Rp%.0f%n", total);

            System.out.println("===========================");
        }

        // Menutup Scanner
        input.close();
    }
}
