import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Buffered_Output_Stream
{
    public static void main(String[] args) 
    {
        try 
        {
                File file;
                FileOutputStream fout = new FileOutputStream("C:\\Java SE\\Text.txt");
                BufferedOutputStream bout = new BufferedOutputStream(fout);
                String s = "This Is Buffer Work";
                byte b[] = s.getBytes();
                bout.write(b);
                bout.flush();
                bout.close();
                fout.close();
                System.out.println("Success...");
        } catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}