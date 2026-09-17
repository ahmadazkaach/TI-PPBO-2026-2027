 import java.util.Scanner;

public class Membacabilanganbulat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca tiga bilangan bulat
        System.out.print("Masukkan bilangan pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int b = input.nextInt();

        System.out.print("Masukkan bilangan ketiga: ");
        int c = input.nextInt();

        // Menentukan bilangan terbesar
        int terbesar;

        if (a > b) {
            if (a > c) {
                terbesar = a;
            } else {
                terbesar = c;
            }
        } else {
            if (b > c) {
                terbesar = b;
            } else {
                terbesar = c;
            }
        }

        System.out.println("Bilangan terbesar: " + terbesar);

        input.close();
    }
}

