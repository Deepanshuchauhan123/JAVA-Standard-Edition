import java.io.*;

public class Creating_File
{
    public static void main(String args[])
    {
        try
        {
           File file=new File("C:\\Java SE\\ myfile.txt");
           if(file.createNewFile()){
               System.out.println("New File  Created Successfully !");
           }else{
               System.out.println("File Already Exists !");
           }
        } catch (IOException e)
        {
            System.out.println(e);
        }
    }
}