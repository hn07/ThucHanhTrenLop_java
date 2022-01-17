import java.util.Scanner;

public class Cau44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tong cac chu so trong n");
        System.out.println("hay nhap vao so n ");
        int n = (int) sc.nextDouble();
        System.out.println(tong(n));

    }

    public static int tong(int n) {
        int s = 1;
        int tach;
        for (; n != 0;) {
            tach = n % 10;
            s *= tach;
            n /= 10;
        }
        return s;
    }
}
