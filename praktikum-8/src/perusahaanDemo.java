public class perusahaanDemo {
    public static void main(String[] args) {
        Manager manager = new Manager("budi","M001",8000000, 2000000);

        Staff staff = new Staff("budi","A001",80000, 20000);

        Direktur direktur = new Direktur("azka","A001",90000000,10000000,60000);

        System.out.println("=== DATA MANAGER ===");
        manager.tampilkanData();
        System.out.println("Tunjangan Jabatan : "
                + manager.getTunjanganJabatan());

        System.out.println("\n=== DATA STAFF ===");
        staff.tampilkanData();
        System.out.println("Tunjangan Kinerja : "
                + staff.getTunjanganKinerja());

        System.out.println("\n=== DATA DIREKTUR ===");
        direktur.tampilkanData();
        System.out.println("Tunjangan Jabatan : "
                + direktur.getTunjanganJabatan());
        System.out.println("Tunjangan Saham : "
                + direktur.gettunjanganSaham());
    }
}
