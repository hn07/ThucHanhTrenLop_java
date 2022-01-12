// import java.nio.channels.Pipe;

public class Tinh {
    public static void main(String[] args) {
        System.out.println("Tính");
        System.out.println("dien_tich_hinh_chu_nhat: " + dien_tich_hinh_chu_nhat(5, 10) );
        System.out.println("dien_tich_hinh_tam_giac: "+ dien_tich_hinh_tam_giac(5, 6, 5));
        System.out.println("dien_tich_hinh_tron: "+ dien_tich_hinh_tron(5));
    }

    public static int dien_tich_hinh_chu_nhat(int x, int y) {
        int s;
        s = x*y;
        return s;
    }

    public static double dien_tich_hinh_tam_giac(int x, int y, int z) {
        double s;
        s = 0.5*(x+y+z);
        return s;
    }

    public static double dien_tich_hinh_tron(int x) {
        double s;
        s = 3.14*x*x;
        return s;
    }
    
}
