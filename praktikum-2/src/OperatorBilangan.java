import java.util.Scanner;

public class OperatorBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.print("Masukkan bilangan pertama: ");
        a = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        b = input.nextInt();

        System.out.println("\nHasil Operator Aritmatika:");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));

        System.out.println("\nHasil Perbandingan:");
        System.out.println(a + " > " + b + " = " + (a > b));
        System.out.println(a + " < " + b + " = " + (a < b));
        System.out.println(a + " == " + b + " = " + (a == b));

        input.close();
    }
}