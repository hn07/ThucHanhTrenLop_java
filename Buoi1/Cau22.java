package Buoi1;

public class Cau22 {
    
    public static void main(String[] args) {
        System.out.println("cau 22");
        System.out.println("tich la "+   souoc());
     
    }

    public static double souoc() {
        double s = 1;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                s *= i;
            }
        }
        return s;
    }
}
