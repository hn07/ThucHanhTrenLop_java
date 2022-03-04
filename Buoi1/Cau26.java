package Buoi1;

public class Cau26 {
    
    public static void main(String[] args) {
        System.out.println("cau 24");
       System.out.println("tich cac uoc so le là " + souoc());

    }

    public static double souoc() {
        double s = 1.0;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 != 0) {
                System.out.println(i);
                s *= i;
            }
        }
        return s;
        
    }
}
