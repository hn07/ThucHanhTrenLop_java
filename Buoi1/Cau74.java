import java.util.Scanner;

public class Cau74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy kiểm tra số nguyên dương n có toàn chữ số chẳn hay không");
        System.out.println("hay nhap vao so n ");
        int a = (int) sc.nextDouble();
        int b = (int) sc.nextDouble();
        int c = (int) sc.nextDouble();
        System.out.println(soLonNhat(a, b, c));

    }

    public static int soLonNhat(int a, int b, int c) {
      int max = a;
      if(b > max){
          max = b;
      }
      if(c > max){
          max = c;
      }
        return max;
    }
}
