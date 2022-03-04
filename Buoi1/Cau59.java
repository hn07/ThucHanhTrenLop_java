package Buoi1;

import java.util.Scanner;

public class Cau59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy kiểm tra số nguyên dương n có toàn chữ số chẳn hay không");
        System.out.println("hay nhap vao so n ");
        int n = (int) sc.nextDouble();
        int m = (int) sc.nextDouble();
        System.out.println(UCLN(n, m));

    }

    public static int UCLN(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;

    }
}
