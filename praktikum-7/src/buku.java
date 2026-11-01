
public class buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getPengarang() {
        return pengarang;
    }
    // Setter pengarang
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public int getTahunTerbit() {
        return tahunTerbit;
    }

}
