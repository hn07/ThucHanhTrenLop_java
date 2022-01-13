package Java_Basic_Exercises;

import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {
        System.out.println("Write a Java program that takes a number as input and prints its multiplication table upto 10");
        System.out.println("viet chuong trinh java lay mot so lam dau vao va in bang cuu chuong cua no len den 10");
        Scanner sc  = new   Scanner(System.in);
        System.out.println("hay nhap x ");
        int x  = sc.nextInt();
        System.out.println("cuu chuong "+ x );
        System.out.println("cuu chuong "+ cuu_Chuong(x));
    }

    public static int cuu_Chuong(int x) {
        int s=1;
        for(int i =1; i<=10 ;i++){
            s = x*i;
            System.out.println(x+" x "+ i + " = " +s);
        }
        return s;
    }

}
