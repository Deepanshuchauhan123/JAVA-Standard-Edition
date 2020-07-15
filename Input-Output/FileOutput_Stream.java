
import java.io.FileOutputStream;

public class FileOutput_Stream
{
    public static void main(String[] args) 
    {
        try {
            FileOutputStream f = new FileOutputStream("C:\\Java SE\\Text.txt");
            f.write(65);
            f.close();
            System.out.println("Success...");

        } catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}