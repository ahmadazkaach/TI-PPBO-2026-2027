public class isibuku {
    public static void main(String[] args) {
        buku b1 =new buku("MADILOG","TAN MALAKA",1949);

        System.out.println("=======");
        buku b2 =new buku("ELIANA","TERE LIYE",2011);

        System.out.println("judul:"+b1.judul);
        System.out.println("pengarang:"+b1.pengarang);
        System.out.println("tahunTerbit:"+b1.tahunTerbit);
        System.out.println("=======");
        System.out.println("judul:"+b2.judul);
        System.out.println("pengarang:"+b2.pengarang);
        System.out.println("tahunTerbit:"+b2.tahunTerbit);
    }
}
