import java.util.Scanner;

public class Cau58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy kiểm tra số nguyên dương n có toàn chữ số chẳn hay không");
        System.out.println("hay nhap vao so n ");
        int n = (int) sc.nextDouble();
        if (kiemTraSoGiamDan(n) == true) {
            System.out.println("so nguyen duong n la so giam dan");
        } else {
            System.out.println("so nguyen duong n khong phai la so giam dan");

        }

    }

    public static boolean kiemTraSoGiamDan(int n) {
       
        int temp = n;

        // lay so cuoi
        int soCuoi = temp % 10;
        temp /= 10;

        while (n != 0) {
            int ChuSoKeCuoi = n % 10;
            if (soCuoi > ChuSoKeCuoi) {
                return false;

            } else {
                soCuoi = ChuSoKeCuoi;
            }
            n /= 10;
        }
        return true;
    }

}
