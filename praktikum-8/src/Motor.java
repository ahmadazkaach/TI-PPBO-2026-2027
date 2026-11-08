public class Motor extends Kendaraan{
    private String jenisMotor;


    public Motor(String merek,String jenisMotor,int kecepatanMaks) {
        super(merek,kecepatanMaks);
        this.jenisMotor = jenisMotor;
    }
    public static void main (String[] args) {
        Motor motor = new Motor("Honda","matic",150);

        System.out.println("merek : " +motor.merek);
        System.out.println("jenisMotor : " +motor.jenisMotor);
        System.out.println("kecepatan : " +motor.kecepatanMaks);
    }
}
