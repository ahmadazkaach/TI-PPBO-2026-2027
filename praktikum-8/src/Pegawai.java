public class Pegawai {
    protected String nama;
    protected String nip;
    protected double gajipokok;

    public Pegawai(String nama,String nip,double gajipokok){
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
