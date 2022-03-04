package Buoi1;

import java.util.Scanner;

public class Cau75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy kiểm tra số nguyên dương n có toàn chữ số chẳn hay không");
        System.out.println("hay nhap vao so n ");
        int a = (int) sc.nextDouble();
        int b = (int) sc.nextDouble();
       if (soLonNhat(a, b) == true) {
           System.out.println("cung dau");
       } else {
        System.out.println("khong cung dau");
           
       }
    }

    public static boolean soLonNhat(int a, int b) {
       int k = a *b;
        if ( k < 0) {
          return false;
        }
         return true;
    }
}
