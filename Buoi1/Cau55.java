import java.util.Scanner;

public class Cau55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy kiểm tra số nguyên dương n có toàn chữ số chẳn hay không");
        System.out.println("hay nhap vao so n ");
        int n = (int) sc.nextDouble();
        if (kiemtraSoChan(n) == true) {
            System.out.println("so nguyen duong n toan la so chan ");
        } else {
            System.out.println("so nguyen duong n khong phai toan la so chan ");

        }

    }

    public static boolean kiemtraSoChan(int n) {
        int k = n;
        while (n > 0) {
            int temp = n % 10;
            if (temp % 2 != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
