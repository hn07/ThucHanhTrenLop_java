import java.util.Scanner;

public class Cau36 {
    public static void main(String[] args) {
        System.out.println("tong n lan can bac 2 ");
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("hay nhap vao so n ");
        do {
            n = sc.nextInt();
            if(n<2){
                System.out.println("hay nhap lai so n ");
            }
            
        } while (n < 2);
        System.out.println(canBac2(n));

    }

    public static double canBac2(double n) {
        double i = 3;
        double S =Math.pow(2.0, 1.0/2);
        while(i <= n)
        {
            S = Math.pow((i + S) * 1.0, 1.0/i);
            i++;
        }
        return S;
    }
}
