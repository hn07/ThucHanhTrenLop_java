public class Cau19 {
    public static void main(String[] args) {
        System.out.println("cau 19");
        System.out.println(cau());
        }
        public static double tinhGiaithua(Double n) {
            double giai_thua = 1.0;
            if (n == 0 || n == 1) {
                return giai_thua;
            } else {
                for (int i = 2; i <= n; i++) {
                    giai_thua *= i;
                }
                return giai_thua;
            }
        }
        private static double cau() {
            double  s  = 0.0;
             double i ;
             int n = 1;
             for(i=0; i<=n; i++){
               s += (Math.pow(2, (2*i +1 ))) /tinhGiaithua((2*i +1 ));
             }
             return s;
        }
}
