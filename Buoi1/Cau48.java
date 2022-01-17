import java.util.Scanner;

public class Cau48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("chu so dau trong n");
        System.out.println("hay nhap vao so n ");
        int n = (int) sc.nextDouble();
        System.out.println(tong(n));

    }

    public static int tong(int n) {
        int s = 1;
        int temp = n;
        // do {
        // s = temp % 10;
        // temp /= 10;
        // } while (temp != 0);

        for (int i = n; i != 0;) {
            s = i % 10;
            i /= 10;
        }
        return s;
    }
}
