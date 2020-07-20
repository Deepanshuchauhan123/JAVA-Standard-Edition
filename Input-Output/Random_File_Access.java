/*
A random access file behaves like a large array of bytes stored in the file system.
There is a kind of cursor, or index into the implied array, called the file pointer;
input operations read bytes starting at the file pointer and advance the file pointer past the bytes read.

Basically a pointer starts from starting of the file and add the given data at
given position.

*/


import java.io.*;

public class Random_File_Access{

    static final String Filepath = "C:\\Java SE\\Record.txt";

    public static void main(String[] args) {

        try {
            System.out.println(new String(readFromFile(Filepath, 0, 18)));
            writeToFile(Filepath, "I Love Myself", 31);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static byte[] readFromFile(String filepath, int pos, int size) throws IOException {
        RandomAccessFile file = new RandomAccessFile(Filepath, "r");
        file.seek(pos);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }

    private static void writeToFile(String filepath, String data, int pos) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filepath, "rw");
        file.seek(pos);
        file.write(data.getBytes());
        file.close();
    }

}