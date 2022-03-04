package Thuc_Hanh_Ngay_3;

public class UnicodeTrongPhamViDuocChiDinh {
    public static void main(String[] args) {
        String str = "w3resource.com";
        System.out.println(str);

        int soDiemMa1 = str.codePointCount(1, 9);
        int soDiemMa2 = str.codePointCount(1, 10);
        System.out.println("so diem ma la : " + soDiemMa1);
        System.out.println("so diem ma la : " + soDiemMa2);
    }
}
