import java.util.Scanner;

public class Cau57 {
    private static final int ChuSoKeCuoi = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy kiểm tra số nguyên dương n có toàn chữ số chẳn hay không");
        System.out.println("hay nhap vao so n ");
        int n = (int) sc.nextDouble();
        if (kiemTraSoTangDan(n) == true) {
            System.out.println("so nguyen duong n la so tang dan");
        } else {
            System.out.println("so nguyen duong n khong phai la so tang dan");

        }

    }

    public static boolean kiemTraSoTangDan(int n) {
        int checkTangDan = 1;
        int themang = n;

        // lay so cuoi
        int soCuoi = themang % 10;
        themang /= 10;

        while (n != 0) {
            int ChuSoKeCuoi = n % 10;
            if (soCuoi < ChuSoKeCuoi) {
                return false;

            } else {
                soCuoi = ChuSoKeCuoi;
            }
            n /= 10;
        }
        return true;
    }

}
