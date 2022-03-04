package Buoi1;

import java.util.Scanner;

import javax.lang.model.element.Element;

public class Cau32 {
    public static void main(String[] args) {
        System.out.println("kiem tra so chinh phuong ");
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap vao so n ");
        int n = sc.nextInt();
        if (chinhPhuong(n)== true) {
            System.out.println("la so chinh phuong  ");
        } else {
            System.out.println("ko phai la so chinh phuong  ");
        }
    }

    public static boolean chinhPhuong(int n) {
       
        double i = Math.sqrt(n);
        
        if(i*i == n){
            return true;
        }
        return false;        
    }
}
