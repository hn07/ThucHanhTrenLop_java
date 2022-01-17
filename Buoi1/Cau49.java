import java.util.Scanner;

public class Cau49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tong cac chu so trong n");
        System.out.println("hay nhap vao so n ");
        int n = (int) sc.nextDouble();
        System.out.println(tong(n));

    }

    public static int tong(int n) {
        int s = 0;
        do {
            s = s * 10 + n % 10;
            n /= 10;
        } while (n != 0);
        return s;
    }

}
