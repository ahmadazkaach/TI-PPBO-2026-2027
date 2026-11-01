public class DemoSiswa {
    public static void main(String[] args) {
        Siswa siswa = new Siswa();

        // Nilai valid
        siswa.setNilai(90);
        System.out.println("Nilai: " + siswa.getNilai() + " -> Huruf: " + siswa.getNilaiHuruf());

        siswa.setNilai(75);
        System.out.println("Nilai: " + siswa.getNilai() + " -> Huruf: " + siswa.getNilaiHuruf());

        siswa.setNilai(62.5);
        System.out.println("Nilai: " + siswa.getNilai() + " -> Huruf: " + siswa.getNilaiHuruf());

        siswa.setNilai(55);
        System.out.println("Nilai: " + siswa.getNilai() + " -> Huruf: " + siswa.getNilaiHuruf());

        siswa.setNilai(30);
        System.out.println("Nilai: " + siswa.getNilai() + " -> Huruf: " + siswa.getNilaiHuruf());

        // Nilai tidak valid (ditolak, nilai tetap 30)
        siswa.setNilai(120);
        siswa.setNilai(-5);
        System.out.println("Setelah input tidak valid -> Nilai: " + siswa.getNilai()
                + " -> Huruf: " + siswa.getNilaiHuruf());
    }
}