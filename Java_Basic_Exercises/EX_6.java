package Java_Basic_Exercises;

import java.util.Scanner;

public class EX_6 {
    public static void main(String[] args) {
        System.out.println(
                " Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers");
        System.out.println("Viết chương trình Java để in ra tổng (cộng), nhân, trừ, chia và phần dư của hai số");
        System.out.println("-------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap 2 so x va y ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("cong "+ cong(x, y));
        System.out.println("tru "+ tru(x, y));
        System.out.println("nhan "+ nhan(x, y));
        System.out.println("chia "+ chia(x, y));
        System.out.println("mod "+ mod(x, y));

    }

    public static int cong(int x, int y) {
        int s;
        s = x + y;
        return s;
    }

    public static int tru(int x, int y) {
        int s;
        s = x - y;
        return s;
    }

    public static int nhan(int x, int y) {
        int s;
        s = x * y;
        return s;
    }

    public static int chia(int x, int y) {
        int s;
        s = x / y;
        return s;
    }
    public static int mod(int x, int y) {
        int s;
        s = x % y;
        return s;
    }
}
