
public class isibuku {
    public static void main(String[] args) {
        buku b1 =new buku("MADILOG","TAN MALAKA",1949);

        System.out.println("===DATA BUKU AWAL===");
        System.out.println("judul:"+b1.getJudul());
        System.out.println("pengarang:"+b1.getPengarang());
        System.out.println("tahunTerbit:"+b1.getTahunTerbit());
        //MENGUBAH JUDUL DAN PENGARANG MENGGUNAKAN SETTER
        b1.setJudul("BUMI");
        b1.setPengarang("TERE LIYE");


        System.out.println("====DATA BUKU SETELAH DIUBAH===");
        System.out.println("judul:"+b1.getJudul());
        System.out.println("pengarang:"+b1.getPengarang());
        System.out.println("tahunTerbit:"+b1.getTahunTerbit());
    }
}

