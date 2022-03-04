package Buoi1;

public class Cau27 {
    public static void main(String[] args) {
        System.out.println("cau 24");
       System.out.println("so luong cac uoc so le là " + souoc());

    }

    public static int souoc() {
        int s = 0;
        int n = 6;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 != 0) {
                System.out.println(i);
                s ++;
            }
        }
        return s;
        
    }
}
