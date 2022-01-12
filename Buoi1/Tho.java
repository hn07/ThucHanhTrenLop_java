import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Tho {
    public static void main(String[] args) {
        System.out.println("Tho");
        try{
            File f = new File("chu.txt");
            FileWriter fw = new FileWriter(f);
            fw.write("trong dam gi dep bang sen");
            fw.close();

        }
        catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }
}
