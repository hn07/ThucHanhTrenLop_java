import java.util.Scanner;

public class Cau51 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tìm chữ số nho nhất của số nguyên dương n");
        System.out.println("hay nhap vao so n ");
        int n = (int) sc.nextDouble();
        System.out.println(minSoNguyen(n));

    }

    public static int minSoNguyen(int n) {
        int min = n;
        while (n > 0) {
            int temp = n % 10;
            if (temp < min) {
                min = temp;
            }
            n /= 10;
        }
        return min;
    }
}
