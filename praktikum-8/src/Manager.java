public class Manager extends Pegawai {
    private double tunjanganJabatan;

    public Manager(String nama, String nip,double gajipokok,double tunjanganJabatan) {
        super (nama, nip, gajipokok);//panggil construktor pegawai
        System.out.println("2. Constructor Manager dijalankan");
        this.tunjanganJabatan = tunjanganJabatan;
    }
    public double getTunjanganJabatan() {
        return tunjanganJabatan;
    }

    public void  tampilkanRingkasan() {
        System.out.println("2. Tampilkan Ringkasan");
    }

}
