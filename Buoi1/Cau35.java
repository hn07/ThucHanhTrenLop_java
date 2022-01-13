import java.util.Scanner;

public class Cau35 {

    public static void main(String[] args) {
        System.out.println("tong n lan can bac 2 ");
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("hay nhap vao so n ");
        do {
            n = sc.nextInt();
            if (n < 2) {
                System.out.println("hay nhap lai so n ");
            }

        } while (n < 2);
        System.out.println(canBac2(n));
       

    }

    public static double giaiThua(double n) {
        if (n < 1) {
            return 1;
        } else
            return n * giaiThua(n - 1);

    }

    public static double canBac2(double n) {
        double s = Math.sqrt((double)giaiThua(n));

        for (double i = 1.0; i <= n; i++) {
            s = Math.sqrt((giaiThua(n -i))  + s);
        }
        return s;
    }
}
