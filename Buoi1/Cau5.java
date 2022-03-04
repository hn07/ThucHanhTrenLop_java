package Buoi1;

public class Cau5 {
    public static void main(String[] args) {
        System.out.println("cau 5");
        System.out.println(cau());
        }
    
        private static double cau() {
            double  s  =0;
             double i ;
             int n = 2;
             for(i=0; i<=n; i++){
                s +=  (1)/(2*i+1);
             }
             return s;
        }
}
