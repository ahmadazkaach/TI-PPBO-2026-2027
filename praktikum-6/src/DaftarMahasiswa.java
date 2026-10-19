public class DaftarMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] daftar = new Mahasiswa[3];

        daftar[0]= new Mahasiswa("budi","111",3.2);
        daftar[1]= new Mahasiswa("siti","222",3.8);
        daftar[2]= new Mahasiswa("andi","333",3.6);

        for (Mahasiswa m : daftar){
            m.tampilkanData();
            System.out.println("---");
        }
        int jumlahCumlaude = 0;
        for (Mahasiswa m : daftar){
            if(m.isCumlaude()){
                jumlahCumlaude++;
            }
        }
        System.out.println("jumlah mahasiswa cumlaude:"+jumlahCumlaude);
    }
}
