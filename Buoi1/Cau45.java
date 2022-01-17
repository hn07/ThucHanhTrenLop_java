import java.util.Scanner;

public class Cau45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tong cac chu so trong n");
        System.out.println("hay nhap vao so n ");
        int n = (int) sc.nextDouble();
        System.out.println(tong(n));

    }

    public static int tong(int n) {
        int s = 0;
        int tach;
        for (; n != 0;) {
            tach = n % 10;
            if (tach % 2 != 0) {
                s++;
            }
            n /= 10;
        }
        return s;
    }
}
