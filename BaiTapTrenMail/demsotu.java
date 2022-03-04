package BaiTapTrenMail;

import java.util.StringTokenizer;

public class demsotu {
    public static void main(String[] args) {
        dem("toi la sinh vien dai hoc can tho");
    }

    private static void dem(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        int soTuTrongChuoi = stringTokenizer.countTokens();
        System.out.println("so tu cua chuoi la \"" + str + "\" = " + soTuTrongChuoi);
    }
   
}
