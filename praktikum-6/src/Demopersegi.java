public class Demopersegi {
    public static void main(String[] args) {

        persegi p1 = new persegi(5);
        persegi p2 = new persegi(9);
        persegi p3 = new persegi(8);

        System.out.println("hitung persegi");
        System.out.println();

        System.out.println("persegi 1");
        System.out.println("sisi     : "+p1.sisi);
        System.out.println("luas     : "+ p1.hitungLuas());
        System.out.println("keliling : "+p1.hitungKeliling());

        System.out.println("persegi 2");
        System.out.println("sisi     : "+p2.sisi);
        System.out.println("luas     : "+ p2.hitungLuas());
        System.out.println("keliling : "+p2.hitungKeliling());

        System.out.println("persegi 3");
        System.out.println("sisi     : "+p3.sisi);
        System.out.println("luas     : "+ p3.hitungLuas());
        System.out.println("keliling : "+p3.hitungKeliling());

    }
}
