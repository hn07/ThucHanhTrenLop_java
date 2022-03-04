package Thuc_Hanh_Ngay_3;

public class Uncode {
    public static void main(String[] args) {
        String str = "w3resource.com";
        System.out.println("day ban dau: " + str);

        int ChiMuc1 = str.codePointAt(1);
        int ChiMuc2 = str.codePointAt(10);

        System.out.println("tai chi muc 1 " + ChiMuc1);
        System.out.println("tai chi muc 2 " + ChiMuc2);
    }
}
