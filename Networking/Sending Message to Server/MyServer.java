import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer 
{
    public static void main(String[] args) 
    {
        try 
        {
            // Creating server socket and configered at given port 
            ServerSocket sos = new ServerSocket(6666);

             // created socket to accept client request
            Socket soc = sos.accept();

            ObjectInputStream in = new ObjectInputStream(soc.getInputStream());

            String s = (String) in.readUTF();

            System.out.println("Message =  " + s);

            sos.close();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}