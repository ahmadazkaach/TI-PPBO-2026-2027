import java.util.Scanner;

public class PolaSegitigaTerbalikdanPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ukuran: ");
        int n = input.nextInt();

        //segitiga terbalik
        System.out.print("Segitiga terbalik: ");

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // persegi
        System.out.print("\nPersegi: ");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
