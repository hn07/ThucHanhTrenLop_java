public class Cau6 {
    public static void main(String[] args) {
        System.out.println("cau 6");
        System.out.println(cau());
        }
    
        private static double cau() {
            double  s  =0;
             double i ;
             int n = 2;
             for(i=1; i<=n; i++){
                s +=  (1)/(i*(i+1));
             }
             return s;
        }
}
