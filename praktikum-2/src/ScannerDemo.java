import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("masukkan umur: ");
        int umur = sc.nextInt();

        System.out.println("Halo" + nama + ", umur anda " + umur +"tahun.");
    }
}
