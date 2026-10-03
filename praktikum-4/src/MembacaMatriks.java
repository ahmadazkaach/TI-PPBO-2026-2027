import java.util.Scanner;

public class MembacaMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] matriks = new int[3][3];
        int total = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan [" + i + "][" + j + "]: ");
                matriks[i][j] = input.nextInt();
            }
        }
        System.out.println("\njumlah setiap baris: ");

        for (int i = 0; i < 3; i++) {
            int jumlahbaris =0;

            for (int j = 0; j < 3; j++) {
                jumlahbaris += matriks[i][j];
                total += matriks[i][j];
            }
            System.out.println("baris " + (i + 1) + " = " + jumlahbaris);
        }
        System.out.println("jumlah seluruh elemen = " + total);
    }
}