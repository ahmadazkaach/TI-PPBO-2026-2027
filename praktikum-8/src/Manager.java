public class Manager extends Pegawai {
    private double tunjanganJabatan;

    public Manager(String nama, String nip,double gajipokok,double tunjanganJabatan) {
        super (nama, nip, gajipokok);//panggil construktor pegawai
        this.tunjanganJabatan = tunjanganJabatan;
    }

}
