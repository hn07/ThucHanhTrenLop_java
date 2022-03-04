package Buoi1;

import java.util.Scanner;

public class Cau56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy kiểm tra số nguyên dương n có toàn chữ số chẳn hay không");
        System.out.println("hay nhap vao so n ");
        int n = (int) sc.nextDouble();
        if (kiemtraSoChan(n) == true) {
            System.out.println("so nguyen duong n la so doi xung");
        } else {
            System.out.println("so nguyen duong n khong phai la so doi xung ");

        }

    }

    public static boolean kiemtraSoChan(int n) {
        int temp, r, sum = 0;
        for (temp = n; n != 0; n /= 10) {
            r = n % 10;
            sum = sum * 10 + r;

        }
        if (sum != temp) {
            return false;
        }
        return true;
    }
}
