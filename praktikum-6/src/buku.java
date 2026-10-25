public class buku {
    String judul;
    String pengarang;
    int tahunTerbit;

    //construktor berparameter
    public buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    public void tampilkandata() {
        System.out.println("Judul :" + judul);
        System.out.println("Pengarang :" + pengarang);
        System.out.println("Tahun Terbit :" + tahunTerbit);
        System.out.println();
    }
}