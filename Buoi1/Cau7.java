package Buoi1;

public class Cau7 {
    
    public static void main(String[] args) {
        System.out.println("cau 7");
        System.out.println(cau());
        }
    
        private static double cau() {
            double  s  =0;
             double i ;
             int n = 2;
             for(i=1; i<=n; i++){
                s +=  (i)/(i+1);
             }
             return s;
        }
}
