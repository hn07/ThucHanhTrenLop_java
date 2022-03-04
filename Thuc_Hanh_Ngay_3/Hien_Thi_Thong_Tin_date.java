package Thuc_Hanh_Ngay_3;

import java.util.Calendar;

public class Hien_Thi_Thong_Tin_date {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.print("ngay " + cal.get(Calendar.DATE));
        System.out.print(" thang " + cal.get(Calendar.MONTH));
        System.out.println(" nam " + cal.get(Calendar.YEAR));
        System.out.print(cal.get(Calendar.HOUR) +"h:"+cal.get(Calendar.MINUTE));

    }

}
