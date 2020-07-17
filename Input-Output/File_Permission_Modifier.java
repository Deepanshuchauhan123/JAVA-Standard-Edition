import java.io.File;

public class File_Permission_Modifier{
    public static void main(String args[]) throws Exception {
        File file = new File("C:\\Java SE\\RGB.txt");

        boolean exists = file.exists();
        if (exists) {

            file.setExecutable(true);
            file.setReadable(true);
            file.setWritable(false);

            System.out.println("File Permission Changed");

            System.out.println("Executable: " + file.canExecute());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
        } else {
            System.out.println("File Not Found");
        }
    }
}