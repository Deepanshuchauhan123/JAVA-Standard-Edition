/*
It will check File State like which operations can be performed on it.
*/


import java.io.File;

public class File_State_Checker{
    public static void main(String args[]) throws Exception {
        File file = new File("C:\\Java SE\\RGB.txt");

        boolean exists = file.exists();
        if (exists) {
            System.out.println("Executable: " + file.canExecute());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
        } else {
            System.out.println("File Not Found");
        }
    }
}