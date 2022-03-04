package Buoi1;

public class Cau30 {
    public static void main(String[] args) {
        System.out.println("kiem tra So hoan thien ");

        if (soHoanThien() == true) {
            System.out.println("la so hoan thien ");
        } else if(soHoanThien() == false) {
            System.out.println("khong phai la so hoan thien ");
        }
    }

   

    public static boolean soHoanThien() {
        int n = 6;
        int s = 0;
        for (int i = 1; i < n; i++) 
            if (n % i == 0) 
                s += i;
        if (s == n) 
            return true;
        return false;
        
    }
   
    
}
