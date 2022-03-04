package Buoi1;

public class Cau4 {

    public static void main(String[] args) {
        System.out.println("cau 4");
        System.out.println(cau());
        }
    
        private static double cau() {
            double  s  =0;
             double i ;
             for(i=1; i<=5; i++){
                s +=  (1)/(2*i);
             }
             return s;
        }
    
}
