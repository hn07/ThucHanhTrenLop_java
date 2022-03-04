package Thuc_Hanh_Ngay_3;

import java.util.Calendar;

public class TaoDoiTuongNgayBangLopCal {
    public static void main(String[] args) {
        int year= 2002;
        int month= 6;
        int date = 24;

        Calendar cal = Calendar.getInstance();
        cal.clear();
        System.out.println();
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH,month);
        cal.set(Calendar.DATE,date);

        System.out.println(cal.getTime());
    }
}
