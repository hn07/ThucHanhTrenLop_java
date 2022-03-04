package Buoi1;

import java.util.Scanner;

public class Cau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("so luong chu so trooop n ");
        System.out.println("hay nhap vao so n ");
        int n = (int) sc.nextDouble();
        System.out.println(soLuong(n));

    }

    public static int soLuong(int n) {
        int s = 0;
        int m = n;
        if (n == 0) {
            s = 1;
        }

        while (m != 0) {
            s++;
            m = m / 10;
        }
        return s;
    }

}
