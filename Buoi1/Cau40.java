package Buoi1;

import java.util.Scanner;

public class Cau40 {
    public static void main(String[] args) {
        System.out.println("tong n lan can bac 2 ");
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap vao so n ");
        double n = sc.nextDouble();
        System.out.println(nPhanSo(n));

    }

    public static double nPhanSo(double n) {
        double s = 1;

        for (double i = 1.0; i <= n; i++) {

             s = 1 + 1.0 / s;
        }
        return s;
        // double i = 0;
        // double S = 1;
        // while (i <= n) {
        //     S = 1 + 1.0 / S;
        //     i++;
        // }
        // return S;
    }
}
