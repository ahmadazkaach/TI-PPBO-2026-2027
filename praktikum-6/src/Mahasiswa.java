public class Mahasiswa {
    String nama;
    String nim;
    double ipk;

    //constructor default (tanpa parameter)
    public Mahasiswa() {
        nama = "belum diisi";
        nim = "-";
        ipk = 0.0;
    }
        public Mahasiswa(String namaAwal,String nimAwal,double ipkAwal){
            nama=namaAwal;
            nim=nimAwal;
            ipk=ipkAwal;

    }
}
