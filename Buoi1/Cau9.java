public class Cau9 {
    public static void main(String[] args) {
        System.out.println("cau 9");
        System.out.println(cau());
        }
    
        private static double cau() {
            double  s  =1;
             double i ;
             int n = 5;
             for(i=1; i<=n; i++){
                s *= i;
             }
             return s;
        }
}
