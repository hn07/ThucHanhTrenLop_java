package Thuc_Hanh_Ngay_3;

import java.util.Arrays;

public class Sap_xep_mang_so_va_mang_chu {
    public static void main(String[] args) {
        int mang1[] = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        String mang2[] = {
                "Java",

                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        System.out.println("mang so truoc khi sap xep " + Arrays.toString(mang1));
        Arrays.sort(mang1);
        System.out.println("mang so sau khi sap xep "+ Arrays.toString(mang1));
        System.out.println("\n");
        System.out.println("mang char truoc khi sap xep " + Arrays.toString(mang2));
        Arrays.sort(mang2);
        System.out.println("mang char sau khi sap xep "+ Arrays.toString(mang2));


    }
}
