public class Cau25 {
    public static void main(String[] args) {
        System.out.println("cau 25");
        System.out.println("tong cac uoc so chan " + souoc());

    }

    public static double souoc() {
       double s = 0 ;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 0) {
                System.out.println(i);
                s += i;
            }
        }

        return s;
    }
   
    
}
