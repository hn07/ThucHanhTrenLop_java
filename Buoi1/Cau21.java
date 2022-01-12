public class Cau21 {
    
    public static void main(String[] args) {
        System.out.println("cau 21");
        System.out.println("tong la "+   souoc());
     
    }

    public static double souoc() {
        double s = 0.0;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                s += i;
            }
        }
        return s;
    }
}
