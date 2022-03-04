package Buoi1;

public class Cau15 {
    public static void main(String[] args) {
        System.out.println("cau 15");
        System.out.println(cau());
        }
    
        private static double cau() {
            double  s  = 0;
             double i ;
             int n = 3;
             for(i=0; i<=n; i++){
               s += 1/ ( i+ (i+1) ) ;
             }
             return s;
        }
    
    
}
