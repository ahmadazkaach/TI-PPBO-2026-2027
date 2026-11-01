public class Siswa {
    private double nilai;

    // Setter: menolak nilai di luar rentang 0-100
    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai tidak valid! Harus antara 0-100.");
        }
    }

    public double getNilai() {
        return nilai;
    }

    // Mengembalikan nilai huruf berdasarkan nilai tersimpan
    public char getNilaiHuruf() {
        if (nilai >= 80) {
            return 'A';
        } else if (nilai >= 70) {
            return 'B';
        } else if (nilai >= 60) {
            return 'C';
        } else if (nilai >= 50) {
            return 'D';
        } else {
            return 'E';
        }
    }

    public static void main(String[] args) {
        Siswa s = new Siswa();

        s.setNilai(85);
        System.out.println("Nilai: " + s.getNilai() + " -> " + s.getNilaiHuruf()); // A

        s.setNilai(65);
        System.out.println("Nilai: " + s.getNilai() + " -> " + s.getNilaiHuruf()); // C

        s.setNilai(150); // ditolak, nilai tetap 65
        System.out.println("Nilai: " + s.getNilai() + " -> " + s.getNilaiHuruf()); // C
    }
}