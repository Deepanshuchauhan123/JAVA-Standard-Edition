import java.io.FileInputStream;

public class Reading_Complete_File
{

    public static void main(String[] args) 
   {
        try {

            //Required a file having data
            FileInputStream fin = new FileInputStream("C:\\Java SE\\Text.txt");

            //Read only one char as it gets Ascii value, so we need to typecast it to Char
           
             int i = 0;

            while ((i = fin.read())!=-1)
            System.out.print((char) i);
            
            fin.close();

        } catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}