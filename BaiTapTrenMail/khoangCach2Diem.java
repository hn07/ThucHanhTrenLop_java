package BaiTapTrenMail;

import java.util.Scanner;

public class khoangCach2Diem {
    public static void main(String[] args) {
        System.out.println("do dai doan thang A B ");
        lenhGoiHAM(1,2,5,6);
        // doDaiAB();
    }

    private static void doDaiAB() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 5;
        int y2 = 6;

        
        double doDai = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        System.out.println(doDai);
    }

    private static void nhapABtuBanPhim() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap vao A(x1, x2)");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("hay nhap vao B(x1, x2)");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double doDai = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        System.out.println("A("+x1+","+x1+")"  + "B(" +x2+ "," +y2+ ")" );
        System.out.println(doDai);
    }

    private static void lenhGoiHAM(int x1, int y1, int x2, int y2) {
       
        double doDai = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        System.out.println("A("+x1+","+x1+")"  + "B(" +x2+ "," +y2+ ")" );
        System.out.println(doDai);
    }
}
