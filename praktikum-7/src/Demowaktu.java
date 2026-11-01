public class Demowaktu {
    public static void main(String[] args) {
        waktu w1 = new waktu(80,90,88);

        System.out.println("===DATA WAKTU===");
        System.out.println("jam: "+w1.getJam());
        System.out.println("menit: "+w1.getMenit());
        System.out.println("detik: "+w1.getDetik());

        w1.setJam(12);
        w1.setMenit(40);
        w1.setDetik(30);

        System.out.println("===DATA WAKTU SETELAH DIUBAH===");
        System.out.println("jam: "+w1.getJam());
        System.out.println("menit: "+w1.getMenit());
        System.out.println("detik: "+w1.getDetik());

    }
}
