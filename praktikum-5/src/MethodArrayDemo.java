public class MethodArrayDemo {
    static double hitungRataRata(int[] data) {
        int total = 0;
        for (int nilai : data) {
            total += nilai;
        }
        return (double) total / data.length;
    }

    static int cariMaksimum(int[] data) {
        int max = data[0];
        for (int nilai : data) {
            if (nilai > max) {
                max = nilai;
            }
        }
        return max;
    }

    static int[] urutanAscending(int[] data) {
        int[] hasil = data.clone();

        for (int i = 0; i < hasil.length - 1; i++) {
            for (int j = 0; j < hasil.length - 1 - i; j++) {
                if (hasil[j] > hasil[j + 1]) {
                    int temp = hasil[j];
                    hasil[j] = hasil[j + 1];
                    hasil[j + 1] = temp;
                }
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        int[] nilaiUjian = {80, 75, 90, 60, 88};

        System.out.println("Rata-Rata: " + hitungRataRata(nilaiUjian));
        System.out.println("maksimum: " + cariMaksimum(nilaiUjian));

        int[] terurut = urutanAscending(nilaiUjian);
        System.out.print("setelah diurutkan: ");

        for (int n : terurut) {
            System.out.print(n + " ");
        }
    }
}
