public class VariabelDemo {
    public static void main(String[] args) {
        int nilaiBulat = 9;
        double nilaiDouble = nilaiBulat; //widening otomatis
        System.out.println("widening: " + nilaiDouble);

        double pecahan = 9.8;
        int hasilCasting = (int) pecahan; //narrowing eksplisit
        System.out.println("narrowing: " + hasilCasting);


    }
}
