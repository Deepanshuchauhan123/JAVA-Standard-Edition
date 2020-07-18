import java.io.File;

public class File_State_Size_Name{
    public static void main(String args[]) {

        File dir = new File("C:\\Java SE");
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file.getName() + " Can Write: " + file.canWrite() + " Is Hidden: " + file.isHidden() + " Length: " + file.length() + " bytes");
        }
    }
}