/*
Java ByteArrayOutputStream class is used to write common data into multiple files.
In this stream, the data is written into a byte array which can be written to multiple streams later.
*/

import java.io.*;

public class Byte_Array_Output_Stream
{
    public static void main(String[] args) 
    {
        try 
        {

            FileOutputStream fout1 = new FileOutputStream("C:\\Java SE\\Text.txt");
            FileOutputStream fout2 = new FileOutputStream("C:\\Java SE\\Hello.txt");

            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            bout.write(71);
            bout.writeTo(fout1);
            bout.writeTo(fout2);

            bout.flush();
            bout.close();
            System.out.println("Success..");

        } catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}