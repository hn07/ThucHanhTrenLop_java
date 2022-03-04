package Thuc_Hanh_Ngay_3;

public class SoSanh2Chuoi {
   public static void main(String[] args) {
    String str1 = "This is Exercise 1";
    String str2 = "This is Exercise 2";
    System.out.println(str1);
    System.out.println(str2);

    int soSanh = str1.compareTo(str2);

    if (soSanh< 0) {
        System.out.println("chuoi 1 ngan hon chuoi 2");
    }else if(soSanh == 0){
        System.out.println("chuoi 1 bang chuoi 2");
    }else if(soSanh >0 ){
        System.out.println("chuoi 1 lon hon chuoi 2");
    }
   } 
}
