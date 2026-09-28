public class OperasiArray {
    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 60, 88};
        int total = 0;

        for (int n : nilai) {
            total += n;
        }
        double rataRata = (double) total / nilai.length;

        System.out.println("Total: " + total);
        System.out.println("Rata Rata: " + rataRata);


        //cari nilai maksimum dan minimum
        int max = nilai[0];
        int min = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
        }
        System.out.println("Nilai Maxsimum: " + max);
        System.out.println("Nilai Minimum: " + min);

        int cari = 90;
        int posisi = -1; // -1 berarti belum/tidak ditemukan
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == cari) {
                posisi = i;
                break; //hentikan pencarian begitu di temukan
            }
        }
        if (posisi != -1) {
            System.out.println("Nilai " + cari + " ditemukan di indeks " + posisi);
        } else {
            System.out.println("nilai" + cari + " tidak ditemukan ");
        }
    }
}

