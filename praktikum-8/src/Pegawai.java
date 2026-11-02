public class Pegawai {
    private String nama;
    private String nip;
    private double gajipokok;

    public Pegawai(String nama,String nip,double gajipokok) {
        System.out.println("1. Constructor pegawai dijalankan");
        this.nama=nama;
        this.nip=nip;
        this.gajipokok=gajipokok;
    }
    public void tampilkanData(){
        System.out.println("Nama: " + nama);
        System.out.println("Nip : " + nip);
        System.out.println("Gajipokok : " + gajipokok);
    }

}
