public class Kucing extends Hewan{

    public Kucing(String nama) {
        super.nama = nama;
    }
    public static void main(String[] args) {
        Kucing k1 = new Kucing ("poopy");

        System.out.println("nama : " + k1.nama);
        k1.bersuara();
    }

}
