public class Cau3 {
    public static void main(String[] args) {
    System.out.println("cau 3");
    System.out.println(cau());
    }

    private static double cau() {
        double  s  =0;
         double i ;
         for(i=1; i<=5; i++){
            s +=  (1)/(i);
         }
         return s;
    }
    
}
