package Java_Basic_Exercises;

public class Ex_10 {
    public static void main(String[] args) {
        System.out.println(" Write a Java program to compute the specified expressions and print the output");
        System.out.println("Viet chuong trinh java de tinh toan cas bieu thuc duoc chi dinh va in ket qua");
        System.out.println("----------------");
        System.out.println(" phep tinh la " + tinh_toan());
    }

    public static double tinh_toan() {
        double s;
        s = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        return s;

    }
}
