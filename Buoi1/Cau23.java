public class Cau23 {
    public static void main(String[] args) {
        System.out.println("cau 22");
        System.out.println("so luong uoc la "+   souoc());
     
    }

    public static int  souoc() {
        int  s = 0;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                s ++;
            }
        }
        return s;
    }
}
