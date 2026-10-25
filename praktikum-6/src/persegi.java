public class persegi {
    double sisi;

    public persegi(double sisi){
        this.sisi=sisi;
    }
    //menghitung luas persegi
    public double hitungLuas() {
        return sisi * sisi;
    }
    //menghitung keliling
    public double hitungKeliling() {
        return 4 * sisi;
    }
    public void tampilkandata() {
        System.out.println("sisi     : "+sisi);
        System.out.println("luas     : "+hitungLuas());
    }
}
