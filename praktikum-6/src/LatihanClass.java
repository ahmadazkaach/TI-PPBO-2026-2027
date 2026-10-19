public class LatihanClass {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa("siti","67891",3.90);
        m2.tampilkanData();
        System.out.println("Cumlaude?"+ m2.isCumlaude());
    }
}
