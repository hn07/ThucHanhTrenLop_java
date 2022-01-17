import java.util.Scanner;

public class Cau52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("    Dem chữ số lớn nhất của số nguyên dương n");
        System.out.println("hay nhap vao so n ");
        int n = (int) sc.nextDouble();
        System.out.println(dem(n));

    }

    public static int dem(int n) {
        int x = maxSoNguyen(n);
        int dem = 0;
        while(n>0){
            int t = n % 10;
            if(t == x){
                dem ++;
            }
            n /= 10;
        }
        return dem;
    }

    public static int maxSoNguyen(int n) {
        int max = 0;
        while (n > 0) {
            int temp = n % 10;
            if (temp > max) {
                max = temp;
            }
            n /= 10;
        }
        return max;
    }
}
