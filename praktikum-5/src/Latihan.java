public class Latihan {
    static double luaspersegipanjang(double p, double l) {
        return p * l ;
    }
    static double luaslingkaran(double r) {
        return Math.PI * r * r;
    }
    static boolean isPrima(int n) {
        if (n < 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    static double KonversiSuhu (double C) {
        return (C * 1.8) + 32;
    }
    static double KonversiSuhu (double C, String skalatujuan) {
        if (skalatujuan == "kelvin") {
            return C + 273.15;
        } else if (skalatujuan == "fahrenheit") {
            return (C * 1.8) + 32;
        }
        return C;


    }


    public static void main(String[] args) {
        System.out.println(luaspersegipanjang(5, 5));
        System.out.println(luaslingkaran(10));

        System.out.println("bilangan prima dari 1 sampai 50: ");
        for (int i = 1; i <= 50; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        double k1 = KonversiSuhu(25, "kelvin");
        System.out.println("ke kelvin: " + k1);

        double f1 = KonversiSuhu(25, "fahrenheit");
        System.out.println("ke fahrenheit: " + f1);


    }
}
