public class BreakContinueDemo {
    public static void main(String[] args) {
        System.out.println("menggunakan break : ");
        for(int i = 1; i < 10; i++){
            if(1 == 5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("menggunakan continue : ");
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
