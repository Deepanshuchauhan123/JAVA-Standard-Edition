/*
Java application generally uses the data output stream to 
write data that can later be read by a data input stream.

*/


import java.io.*;

public class Data_Output_Stream
{
    public static void main(String[] args)
    {
        try {

            FileOutputStream fout=new FileOutputStream("C:\\Java SE\\Hello.txt");

            DataOutputStream data=new DataOutputStream(fout);

	//For Writing String 
            data.writeUTF("Hello, This is my DataOutput Stream..");

            data.flush();
            data.close();

            System.out.println("Success...");

        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}