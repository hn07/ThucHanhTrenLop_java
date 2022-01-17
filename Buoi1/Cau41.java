import java.util.Scanner;

public class Cau41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cau so nguyen duong S(k)  nho hon n ");
        System.out.println("hay nhap vao so n ");
                double n = sc.nextDouble();
        System.out.println(soNguyenK(n));

    }

    public static double soNguyenK(double n) {
        double S = 0;
        double i = 2;
        while ((S+i) < n) {
            i++;
            S = S + i;
        }
        return i-1;
    }
}
