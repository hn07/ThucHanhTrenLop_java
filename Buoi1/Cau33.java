package Buoi1;

import java.util.Scanner;

public class Cau33 {
    public static void main(String[] args) {
        System.out.println("tong n lan can bac 2 ");
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("hay nhap vao so n ");
        do {
            n = sc.nextInt();
            if(n<1){
                System.out.println("hay nhap lai so n ");
            }
            
        } while (n < 2);
        System.out.println(canBac2(n));

    }

    public static double canBac2(double n) {
        double s = Math.sqrt((double) 2);

        for (double i = 2.0; i <= n; i++) {
            s = Math.sqrt(2 + s);
        }
        return s;
    }
}
