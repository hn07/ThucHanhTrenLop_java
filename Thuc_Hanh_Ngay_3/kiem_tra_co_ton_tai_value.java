package Thuc_Hanh_Ngay_3;

public class kiem_tra_co_ton_tai_value {
    public static void main(String[] args) {
        int mang[] = { 1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456 };
        System.out.println(value_test(mang, 1472));
        System.out.println(value_test(mang, 1471));
    }

    public static boolean value_test(int mang[], int x) {
        for (int i : mang) {
            if (i == x) {
                return true;
            }
        }
        return false;
    }
}
