

import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Meminta input panjang dan lebar persegi panjang
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();

        // Menghitung luas dan keliling persegi panjang
        double luasPersegiPanjang = panjang * lebar;
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        System.out.println("\n=== Persegi Panjang ===");
        System.out.println("Luas      : " + luasPersegiPanjang);
        System.out.println("Keliling  : " + kelilingPersegiPanjang);

        // Menentukan apakah luas persegi panjang lebih dari 100
        boolean luasBesar = luasPersegiPanjang > 100;

        System.out.println("Luas lebih dari 100? : " + luasBesar);

        // Meminta input jari-jari lingkaran
        System.out.print("\nMasukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        // Menghitung luas dan keliling lingkaran menggunakan Math.PI
        double luasLingkaran = Math.PI * jariJari * jariJari;
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        System.out.println("\n=== Lingkaran ===");
        System.out.println("Luas      : " + luasLingkaran);
        System.out.println("Keliling  : " + kelilingLingkaran);

        input.close();
    }
}