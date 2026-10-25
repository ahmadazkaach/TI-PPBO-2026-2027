
public class daftarbuku {
    public static void main (String[] args) {
        buku[] daftar = new buku[4];

        daftar[0] = new buku ("abang ganteng","haiqal",2026);
        daftar[1] = new buku ("rahasia kaya","azka",2023);
        daftar[2] = new buku ("jago ngoding","ahmad",2024);
        daftar[3] = new buku ("modilog","tan malaka",2021);

        for(buku B :daftar){
            if(B.tahunTerbit>= 2024){
                B.tampilkandata ();
                System.out.println("======");
            }
        }
    }
}
