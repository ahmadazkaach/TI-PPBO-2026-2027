public class latihan5 {
    public static void main (String[] args) {
        persegi[] daftar =new persegi[4];
        daftar[0] = new persegi(8);
        daftar[1] = new persegi(6);
        daftar[2] = new persegi(4);
        daftar[3] = new persegi(3);

        persegi terbesar =daftar[0];

        for (persegi p : daftar) {
            if(p.hitungLuas()>terbesar.hitungLuas()){
                terbesar = p;
            }
        }
        terbesar.tampilkandata();
    }

    }
