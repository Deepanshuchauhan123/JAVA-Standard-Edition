import java.io.File;
import java.io.IOException;

public class File_Path{
    public static void main(String args[]) {

        String path = "";
        boolean bool = false;
        try {
            File file = new File("C:\\Java SE\\Myworld.txt");
            file.createNewFile();
            System.out.println(file);

            File file2 = file.getCanonicalFile();
            System.out.println(file2);

            bool = file2.exists();
            path = file2.getAbsolutePath();
            System.out.println(bool);

            if (bool) {
                System.out.println(path + " Exists? " + bool);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}