public class Chuoi {
    public static void main(String[] args) {
        System.out.println("Chuoi");
        System.out.println(ghep_chuoi());
        System.out.println("do_dai_cua_chuoi "+ do_dai_cua_chuoi("CAN THO"));
    }

    public static String ghep_chuoi() {
        String s1 = "CAN ThO ";
        String s2 = "DAI HOC";
        String s3 = s1.concat(s2);
        return s3;
    }
    public static int do_dai_cua_chuoi(String x) {
        String s = x;
        return s.length();
    }
}
