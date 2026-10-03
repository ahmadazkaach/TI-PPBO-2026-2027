import java.util.Scanner;

public class PengolahNilaiKelas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ==============================
        // a. Input jumlah mahasiswa
        // ==============================
        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = input.nextInt();

        int[] nilai = new int[N];

        // Input nilai setiap mahasiswa
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        // ==============================
        // b. Menghitung data nilai
        // ==============================
        int KKM = 70;
        int total = 0;
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 0; i < N; i++) {

            // Menghitung total nilai
            total += nilai[i];

            // Mencari nilai tertinggi
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            // Mencari nilai terendah
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }

            // Menghitung mahasiswa lulus dan tidak lulus
            if (nilai[i] >= KKM) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        double rataRata = (double) total / N;

        // ==============================
        // Menampilkan array sebelum sorting
        // ==============================
        System.out.println("\n=================================");
        System.out.println("       LAPORAN NILAI KELAS");
        System.out.println("=================================");

        System.out.print("Nilai sebelum diurutkan : ");

        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i] + " ");
        }

        // ==============================
        // c. Bubble Sort Ascending
        // ==============================
        for (int i = 0; i < N - 1; i++) {

            for (int j = 0; j < N - 1 - i; j++) {

                if (nilai[j] > nilai[j + 1]) {

                    // Tukar nilai
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        // ==============================
        // Menampilkan hasil setelah sorting
        // ==============================
        System.out.print("\nNilai setelah diurutkan : ");

        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i] + " ");
        }

        // ==============================
        // d. Laporan hasil
        // ==============================
        System.out.println("\n");
        System.out.println("---------------------------------");
        System.out.println("Rata-rata kelas       : " + rataRata);
        System.out.println("Nilai tertinggi       : " + tertinggi);
        System.out.println("Nilai terendah        : " + terendah);
        System.out.println("Jumlah mahasiswa lulus      : " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
        System.out.println("KKM                   : " + KKM);
        System.out.println("---------------------------------");
        System.out.println("Program selesai.");
    }
}
