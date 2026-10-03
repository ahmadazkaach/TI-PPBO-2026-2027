import java.util.Scanner;

public class NilaiTerbesarKedua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = input.nextInt();

        int [] angka = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
    }
        int terbesar = angka[0];
        int terbesarkedua = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++){
            if (angka[i] > terbesar){
                terbesarkedua = terbesar;
                terbesar = angka[i];
            } else if (angka[i] > terbesarkedua && angka[i] != terbesar){
                terbesarkedua = angka[i];
            }
        }
        System.out.println("Nilai terbesar = " + terbesar);
        System.out.println("Nilai terbesarkedua = " + terbesarkedua);
    }
}
