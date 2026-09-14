public class LogikaDemo {
    public static void main(String[] args) {
        int nilaiUjian = 80;
        int kehadiran = 90; // persen

        if (nilaiUjian >= 75 && kehadiran >= 80) {
            System.out.printf("LULUS mata kuliah");
        } else {
            System.out.printf("TIDAK LULUS mata kuliah");
        }
//or dan out
        boolean punyaKTP = false;
        boolean punyaSIM = true;

        if (punyaKTP || punyaSIM) {
            System.out.println(" boleh menyewa kendaraaan");
        }
        if (!punyaKTP) {
            System.out.println("KTP belum tersedia");
        }
    }
}