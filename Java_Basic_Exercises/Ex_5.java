package Java_Basic_Exercises;

import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        System.out.println("Write a Java program that takes two numbers as input and display the product of two numbers.");
        System.out.println("Viết chương trình Java lấy hai số làm đầu vào và hiển thị tích của hai số.");
        System.out.println("------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap 2 so a va b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("c "+nhan_2_so_nhap_tu_ban_phim(a,b));
    }

    public static int  nhan_2_so_nhap_tu_ban_phim(int a, int b) {
        int c = a * b;
       return c;
    }
}
