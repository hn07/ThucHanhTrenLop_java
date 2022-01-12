// import java.io.File;

public class vonglap {
    public static void main(String[] args) {
        System.out.println("vong lap");
        System.out.println("tong_1000_vong_for  "+ tong_1000_vong_for());
        System.out.println("tong_1000_vong_while  "+ tong_1000_vong_while());
    }
    public static int tong_1000_vong_for() {
        int tong = 0;
        for(int i =1 ; i <= 1000 ;i++){
            tong += i;
        }
        return tong;
    }
    public static int tong_1000_vong_while() {
        int tong = 0;
        int i=1;
        while(i <=1000){
            tong += i;
            i++;
        }
        return tong;
    }
}
