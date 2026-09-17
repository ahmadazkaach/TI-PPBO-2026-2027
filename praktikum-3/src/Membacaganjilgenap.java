import java.util.Scanner;

public class Membacaganjilgenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca bilangan bulat
        System.out.print("Masukkan bilangan bulat: ");
        int bilangan = input.nextInt();

        // Menentukan ganjil atau genap
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan genap");
        } else {
            System.out.println("Bilangan ganjil");
        }
    }
}