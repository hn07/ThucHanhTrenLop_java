package Thuc_Hanh_Ngay_3;

public class Tinh_trung_binh_cac_phantu {
    public static void main(String[] args) {
        int mang [] = {20, 30, 25, 35, -16, 60, -100};
        int trungBinh = 0;
        for (int i : mang) {
            trungBinh +=i;
        }
        trungBinh /= mang.length;
        System.out.println("gia tri trung binh la "+ trungBinh);
    }
}
