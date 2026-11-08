import java.util.Scanner;

public class Mobil extends Kendaraan{
    private int jumlahPintu;

    public Mobil(String merek, int kecepatanMaks, int jumlahPintu) {
        super(merek,kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
    }
    public void tampilkanInfo(){
    System.out.println("Merek : "+this.merek);
    System.out.println("Kecepatan : "+this.kecepatanMaks);
    System.out.println("Jumlah Pintu : "+this.jumlahPintu);
    }
}
