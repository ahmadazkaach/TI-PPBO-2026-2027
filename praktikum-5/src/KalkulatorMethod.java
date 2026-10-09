
import java.util.Scanner;
import java.util.Arrays;

public class KalkulatorMethod {

    // Method penjumlahan 2 angka
    static double tambah(double a, double b) {
        return a + b;
    }

    // Method overloading: penjumlahan 3 angka
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    // Method pengurangan
    static double kurang(double a, double b) {
        return a - b;
    }

    // Method perkalian
    static double kali(double a, double b) {
        return a * b;
    }

    // Method pembagian
    static double bagi(double a, double b) {
        return a / b;
    }

    // Method perpangkatan
    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    // Method akar kuadrat
    static double akarKuadrat(double a) {
        return Math.sqrt(a);
    }

    // Method mencari hasil terbesar dalam riwayat
    static double riwayatKeMaksimum(double[] riwayatHasil) {
        double maksimum = riwayatHasil[0];

        for (double hasil : riwayatHasil) {
            if (hasil > maksimum) {
                maksimum = hasil;
            }
        }

        return maksimum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menyimpan riwayat hasil perhitungan
        double[] riwayatHasil = new double[1000];
        int jumlahHasil = 0;

        int pilihan;

        do {
            System.out.println("\n===== KALKULATOR METHOD =====");
            System.out.println("1. Tambah 2 angka");
            System.out.println("2. Tambah 3 angka");
            System.out.println("3. Kurang");
            System.out.println("4. Kali");
            System.out.println("5. Bagi");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar kuadrat");
            System.out.println("0. Keluar");
            System.out.print("Pilih operasi: ");
            pilihan = input.nextInt();

            double a, b, hasil = 0;

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    hasil = tambah(a, b);
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    System.out.print("Masukkan angka ketiga: ");
                    double c = input.nextDouble();

                    hasil = tambah(a, b, c);
                    break;

                case 3:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    hasil = kurang(a, b);
                    break;

                case 4:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    hasil = kali(a, b);
                    break;

                case 5:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    if (b == 0) {
                        System.out.println("Error: Tidak bisa membagi dengan nol!");
                        continue;
                    }

                    hasil = bagi(a, b);
                    break;

                case 6:
                    System.out.print("Masukkan bilangan: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan pangkat: ");
                    b = input.nextDouble();

                    hasil = pangkat(a, b);
                    break;

                case 7:
                    System.out.print("Masukkan bilangan: ");
                    a = input.nextDouble();

                    if (a < 0) {
                        System.out.println(
                                "Error: Akar kuadrat bilangan negatif tidak menghasilkan bilangan real."
                        );
                        continue;
                    }

                    hasil = akarKuadrat(a);
                    break;

                case 0:
                    System.out.println("\nProgram kalkulator selesai.");

                    if (jumlahHasil > 0) {
                        // Membuat array sesuai jumlah hasil yang tersimpan
                        double[] dataRiwayat =
                                Arrays.copyOf(riwayatHasil, jumlahHasil);

                        System.out.println(
                                "Hasil terbesar: "
                                        + riwayatKeMaksimum(dataRiwayat)
                        );
                    } else {
                        System.out.println(
                                "Belum ada perhitungan yang dilakukan."
                        );
                    }

                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    continue;
            }

            // Menyimpan dan menampilkan hasil perhitungan
            if (pilihan >= 1 && pilihan <= 7) {
                System.out.println("Hasil: " + hasil);

                riwayatHasil[jumlahHasil] = hasil;
                jumlahHasil++;
            }

        } while (pilihan != 0);

        input.close();
    }
}

