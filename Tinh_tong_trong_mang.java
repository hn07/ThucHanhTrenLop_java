public class Tinh_tong_trong_mang {
    public static void main(String[] args) {
        int mang1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        for (int k : mang1) {
            sum += k;
        }
        System.out.println("tong la " + sum);
    }
}
