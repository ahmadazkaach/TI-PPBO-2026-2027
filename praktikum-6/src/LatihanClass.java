public class LatihanClass {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();

        m1.nama = "budi";
        m1.nim ="12345";
        m1.ipk = 3.75;

        System.out.println("Nama:" +m1.nama);
        System.out.println("NIM:" +m1.nim);
        System.out.println("IPK:" +m1.ipk);

        Mahasiswa m2 = new Mahasiswa();
        m2.nama = "siti";
        m2.nim ="67891";
        m2.ipk =3.9;

        System.out.println(m1.nama+"-"+m1.ipk);
        System.out.println(m2.nama+"-"+m2.ipk);
    }
}
