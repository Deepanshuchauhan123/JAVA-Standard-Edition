import java.io.*;

public class Byte_Array_Input_Stream
{
    public static void main(String[] args) 
    {
        try {

            byte[] buf = {39, 40, 41, 42};

            ByteArrayInputStream byt = new ByteArrayInputStream(buf);

            int j = 0;

            while ((j = byt.read()) != -1) 
            {
                char ch = (char) j;
                System.out.println("ASCII Value: " + j + " Special Character is: " + ch);
            }

        } catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}