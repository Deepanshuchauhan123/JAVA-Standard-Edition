import java.io.FileOutputStream;

public class File_Output_Stream_Write_String
{
    public static void main(String[] args)
    {
        try {
                FileOutputStream f = new FileOutputStream("C:\\Java SE\\Text.txt");
                
                String s="Hello, This is Deepanshu Chauhan";

                //Converting string into byte array
                byte b[]=s.getBytes();

                //writing byte array in file, it first search file at given location
               // and then clear the file and then write the byte array in form of string
                f.write(b);

                //Closing the file
                f.close();
                
                System.out.println("Success...");

            } catch (Exception e)
            {
                System.out.println(e);
            }
    }
}