package Buoi1;

public class Cau1 {
    public static void main(String[] args) {
        System.out.println("Cau 1");
        System.out.println(" tong tu  1 den n " +cau1());
    }

    public static int  cau1() {
        int  s = 0;
        int n = 100;
        for(int i =1  ; i <= n ; i++){
            s =  s + i;
        }
        return s;
    }

}
