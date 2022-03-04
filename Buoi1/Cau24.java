package Buoi1;

public class Cau24 {
    public static void main(String[] args) {
        System.out.println("cau 24");
        System.out.print("cac uoc so le ");
        souoc();

    }

    public static void souoc() {
        
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 != 0) {
                System.out.print(i +" ");
            }
        }
        
    }
}
