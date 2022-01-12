public class Cau2 {
    
    public static void main(String[] args) {
        System.out.println("Cau 1");
        System.out.println(" tong " +cau2());
    }

    public static int  cau2() {
        int  s = 0;
        int n = 2;
        for(int i =0  ; i <= n ; i++){
            s += Math.abs(2)*i;
        }
        return s;
    }
}
