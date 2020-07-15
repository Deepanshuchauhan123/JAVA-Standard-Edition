/*
Java SequenceInputStream class is used to read data from multiple streams. 
It reads data sequentially (one by one).
*/

import java.io.*;

public class Sequence_Input_Stream
{
    public static void main(String[] args) 
    {
        try 
        {
            FileInputStream fin1 = new FileInputStream("C:\\Java SE\\Textin.txt");
            FileInputStream fin2 = new FileInputStream("C:\\Java SE\\Text.txt");

            SequenceInputStream inst = new SequenceInputStream(fin1, fin2);
            int j;
            while ((j = inst.read()) != -1) 
            {
                System.out.print((char) j);
            }
            inst.close();
            fin1.close();
            fin2.close();


        } catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}