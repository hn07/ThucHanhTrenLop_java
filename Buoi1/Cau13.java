package Buoi1;

public class Cau13 {
    public static void main(String[] args) {
        System.out.println("cau 12");
        System.out.println(cau());
        }
    
        private static double cau() {
            double  s  = 0;
             double i ;
             int n = 2;
             for(i=1; i<=n; i++){
               s += Math.pow(2, 2*i);
             }
             return s;
        }
    
    
}
