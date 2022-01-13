public class Cau29 {
    public static void main(String[] args) {
        System.out.println("cau 24");
        System.out.print("uoc le lơn nhat  " + souoc());

    }

    public static double souoc() {
        double max = 1;
        double n = 100;
        for (double i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 != 0) {
                if (max < i) {
                    max = i;
                }
            }

        }
        return max;

    }
}
