
import java.util.Scanner;
import java.util.Arrays;

public class latihan4_5 {

    // Method mencari nilai minimum
    static int cariNilaiMinimum(int[] data) {
        int min = data[0];

        for (int nilai : data) {
            if (nilai < min) {
                min = nilai;
            }
        }

        return min;
    }

    // Method mencari nilai maksimum
    static int cariNilaiMaksimum(int[] data) {
        int max = data[0];

        for (int nilai : data) {
            if (nilai > max) {
                max = nilai;
            }
        }

        return max;
    }

    // Method menghitung total nilai
    static int hitungTotal(int[] data) {
        int total = 0;

        for (int nilai : data) {
            total += nilai;
        }

        return total;
    }

    // Method mencari nilai di atas rata-rata
    static int[] filterDiAtasRataRata(int[] data) {
        int total = hitungTotal(data);
        double rataRata = (double) total / data.length;

        int jumlah = 0;

        // Menghitung jumlah nilai di atas rata-rata
        for (int nilai : data) {
            if (nilai > rataRata) {
                jumlah++;
            }
        }

        // Membuat array baru
        int[] hasil = new int[jumlah];
        int index = 0;

        // Memasukkan nilai di atas rata-rata
        for (int nilai : data) {
            if (nilai > rataRata) {
                hasil[index] = nilai;
                index++;
            }
        }

        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta jumlah nilai ujian
        System.out.print("Masukkan jumlah nilai ujian: ");
        int jumlah = input.nextInt();

        // Validasi jumlah nilai
        if (jumlah <= 0) {
            System.out.println("Jumlah nilai harus lebih dari 0.");
            input.close();
            return;
        }

        // Membuat array
        int[] nilaiUjian = new int[jumlah];

        // Mengisi array dari input pengguna
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ujian ke-" + (i + 1) + ": ");
            nilaiUjian[i] = input.nextInt();
        }

        // Menghitung total dan rata-rata
        int total = hitungTotal(nilaiUjian);
        double rataRata = (double) total / nilaiUjian.length;

        // Memfilter nilai di atas rata-rata
        int[] hasil = filterDiAtasRataRata(nilaiUjian);

        // Menampilkan hasil
        System.out.println("\nData nilai: " + Arrays.toString(nilaiUjian));
        System.out.println("Nilai minimum: " + cariNilaiMinimum(nilaiUjian));
        System.out.println("Nilai maksimum: " + cariNilaiMaksimum(nilaiUjian));
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rataRata);
        System.out.println("Nilai di atas rata-rata: " + Arrays.toString(hasil));

        input.close();
    }
}
