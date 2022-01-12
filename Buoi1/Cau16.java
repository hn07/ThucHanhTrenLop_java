public class Cau16 {
    public static void main(String[] args) {
        System.out.println("cau 12");
        System.out.println(cau());
        }
    
        private static double cau() {
            double  s  = 0.0;
             double i ;
             int n = 3;
             for(i=1; i<=n; i++){
               s += (Math.pow(2, i)) /((i-1)+i);
             }
             return s;
        }
    
}
