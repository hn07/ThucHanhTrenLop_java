public class hello {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("tong "+ cong(3, 8));
        System.out.println("tru "+ tru(3, 8));
        System.out.println("nhan "+ nhan(3.8, 8.9));
        System.out.println("chia "+chia(38, 8));
        
    }
    public static double cong(double a, double b) {
        return a + b ;
    }
    public static double tru(double a, double b) {
        return a-b;
    }
    public static double nhan(double a, double b) {
        return a*b;
    }
    public static double chia(double a, double b) {
        return a/b;
    }
}
