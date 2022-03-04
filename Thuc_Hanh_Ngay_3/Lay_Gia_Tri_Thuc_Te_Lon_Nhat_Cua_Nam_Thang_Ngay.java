package Thuc_Hanh_Ngay_3;

import java.util.Calendar;

public class Lay_Gia_Tri_Thuc_Te_Lon_Nhat_Cua_Nam_Thang_Ngay {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("ngay hien tai " + cal.getTime());
        int actual_MaxYear = cal.getActualMaximum(Calendar.YEAR);

        System.out.println("Nam thuc te toi da " + cal.getActualMaximum(Calendar.YEAR));
        System.out.println("Thang thuc te toi da " + cal.getActualMaximum(Calendar.MONTH));
        System.out.println("Tuan thuc te toi da " + cal.getActualMaximum(Calendar.WEEK_OF_YEAR));
        System.out.println("Ngay thuc te toi da " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
