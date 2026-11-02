public class Staff extends Pegawai{
    private double tunjanganKinerja;

    public Staff(String nama,String nip,double gajipokok,double tunjanganKinerja){
        super(nama, nip, gajipokok);
        this.tunjanganKinerja = tunjanganKinerja;
    }

}
