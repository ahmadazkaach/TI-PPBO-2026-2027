public class Anjing extends Hewan {

    public Anjing(String nama) {
        super.nama = nama;
    }
    public static void main(String[] args) {
        Anjing A1 = new Anjing("stepen");

        System.out.println("nama : " + A1.nama);
        A1.bersuara();
    }
}
