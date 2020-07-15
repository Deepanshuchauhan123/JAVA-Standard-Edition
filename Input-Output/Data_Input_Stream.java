import java.io.*;

public class Data_Input_Stream
{
    public static void main(String[] args)
    {
        try {

            InputStream inputStream=new FileInputStream("C:\\Java SE\\Hello.txt");

            DataInputStream data=new DataInputStream(inputStream);

            int count=data.available();

            byte[] byt=new byte[count];

            inputStream.read(byt);

            for(byte b:byt){
                char k=(char)b;
                System.out.print(k);
            }

        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}