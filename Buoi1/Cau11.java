public class Cau11 {
    public static void main(String[] args) {
        System.out.println("cau 8");
        System.out.println(cau());
        }
    
        private static double cau() {
            double  s  = 1;
             double i ;
             int n = 4;
             for(i=2; i<=n; i++){
                s += (i-1)*i ;
             }
             return s;
        }
    
}
