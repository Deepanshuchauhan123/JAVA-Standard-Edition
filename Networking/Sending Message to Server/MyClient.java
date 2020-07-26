import java.io.*;
import java.net.Socket;

public class MyClient 
{
    public static void main(String[] args) 
    {
        try 
        {
            //Creating Socket 
            Socket soc = new Socket("localhost", 6666);
            ObjectOutputStream out = new ObjectOutputStream(soc.getOutputStream());
            out.writeUTF("Hello Server");
            out.flush();
            out.close();
            //closing socket
            soc.close();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}