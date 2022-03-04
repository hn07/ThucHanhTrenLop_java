package Buoi1;

public class Lap_dieu_kien {
    public static void main(String[] args) {
        System.out.println("kap_dieu_kien ");
        System.out.println("tong_den_n " + tong_den_n(5));
        System.out.println("tong_so_chan_den_n " + tong_so_chan_den_n(5));
        System.out.println("tong_so_le_den_n " + tong_so_le_den_n(5));
        System.out.println("tong_so_chia_het_cho_3 tu 1_den_n "+ tong_so_chia_het_cho_3_den_n(6));
    }

    public static int tong_den_n(int n) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
        }
        return tong;
    }

    public static int tong_so_chan_den_n(int n) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                tong += i;
            }
        }
        return tong;
    }

    public static int tong_so_le_den_n(int n) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                tong += i;
            }
        }
        return tong;
    }
    public static int tong_so_chia_het_cho_3_den_n(int n) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                tong += i;
            }
        }
        return tong;
    }
}
