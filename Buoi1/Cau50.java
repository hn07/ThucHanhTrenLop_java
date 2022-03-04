package Buoi1;

import java.util.Scanner;

public class Cau50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tìm chữ số lớn nhất của số nguyên dương n");
        System.out.println("hay nhap vao so n ");
        int n = (int) sc.nextDouble();
        System.out.println(tong(n));

    }

    public static int tong(int n) {
        int max = 0;
        while (n > 0) {
            int temp = n % 10;
            if (temp > max) {
                max = temp;
            }
            n /= 10;
        }
        return max;
    }

}
