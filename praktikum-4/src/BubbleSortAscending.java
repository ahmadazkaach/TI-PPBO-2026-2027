import java.util.Scanner;

public class BubbleSortAscending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = input.nextInt();

        int[] angka = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Array sebelum diurutkan
        System.out.println("\nSebelum diurutkan:");
        for (int i = 0; i < n; i++) {
            System.out.print(angka[i] + " ");
        }

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (angka[j] > angka[j + 1]) {
                    int temp = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = temp;
                }
            }
        }

        // Setelah diurutkan
        System.out.println("\n\nSetelah diurutkan:");
        for (int i = 0; i < n; i++) {
            System.out.print(angka[i] + " ");
        }
    }
}
