package Buoi1;

import java.util.Scanner;

public class Cau53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("    Dem chữ số nho nhất của số nguyên dương n");
        System.out.println("hay nhap vao so n ");
        int n = (int) sc.nextDouble();
        System.out.println(demSo(n));

    }

    public static int demSo(int n) {
        int x = minSoNguyen(n);
        int dem = 0;
        while(n>0){
            int t = n % 10;
            if(t == x){
                dem ++;
            }
            n /= 10;
        }
        return dem;
    }

    public static int minSoNguyen(int n) {
        int min = n;
        while (n > 0) {
            int temp = n % 10;
            if (temp < min) {
                min = temp;
            }
            n /= 10;
        }
        return min;
    }
}
