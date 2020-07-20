/*
FileDescriptor:: 
	works for opening a file having a specific name.
	Instances of the file descriptor class serve as an opaque handle to
	the underlying machine-specific structure representing an open file,
	an open socket, or another source or sink of bytes
*/

import java.io.*;

public class File_Descriptor{
    public static void main(String[] args) {
        FileDescriptor fd = null;
        byte[] b = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58};
        try {
            File file;
            FileInputStream fis = new FileInputStream("C:\\Java SE\\Record.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Java SE\\Record.txt");
            fd = fos.getFD();
            fos.write(b);
            fos.flush();
            fd.sync();
            int i = 0;
            while ((i = fis.read()) != -1) {
                char c = (char) i;
                System.out.print(c);
            }
            System.out.println("\n Sync() Successfully executed!!");


        } catch (IOException e) {
            System.out.println(e);
        }
    }

}