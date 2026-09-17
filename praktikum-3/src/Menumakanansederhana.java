import java.util.Scanner;

public class Menumakanansederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pilih menu makanan (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Menu: Nasi Goreng");
                break;

            case 2:
                System.out.println("Menu: Mie Ayam");
                break;

            case 3:
                System.out.println("Menu: Bakso");
                break;

            case 4:
                System.out.println("Menu: Kebab");
                break;

            default:
                System.out.println("Makanan tidak tersedia");
        }

        input.close();
    }
}