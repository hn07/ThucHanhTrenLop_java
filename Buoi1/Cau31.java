package Buoi1;

public class Cau31 {
    public static void main(String[] args) {
        System.out.println("kiem tra so nguyen to ");

        if (nguyenTo()== true) {
            System.out.println("la so nguyen to ");
        } else {
            System.out.println("ko phai la so nguyen to ");
        }
    }

    public static boolean nguyenTo() {
        int n = 7;
        if (n < 2) {
            return false;
        }
        int count = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            return true;

        } else {
           return false;

        }

    }
}
