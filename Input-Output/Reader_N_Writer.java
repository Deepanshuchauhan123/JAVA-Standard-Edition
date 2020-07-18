/*
Reader and Writer in Input Output Stream.
*/

import java.io.*;
public class Reader_N_Writer
{
    public static void main(String args[]) 
    {
        try 
        {
            //Writing to File
            Writer w = new FileWriter("C:\\Java SE\\Hello.txt");
            String s = "This is new File Data";
            w.write(s);
            w.close();
            System.out.print("Writing on File : Done\n");

            
            System.out.println("Reading From File :\n");
            //Reading from File
            Reader reader = new FileReader("C:\\Java SE\\Hello.txt");
            int data = reader.read();
            while (data != -1) 
            {
                System.out.print((char) data);
                data = reader.read();
            }
	reader.close();
        } catch (IOException e) 
        {
            System.out.println(e);
        }
    }
}