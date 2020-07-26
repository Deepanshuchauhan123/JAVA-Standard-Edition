import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerChat 
{
    public static void main(String[] args) 
    {
        try 
        {
            ServerSocket sos = new ServerSocket(6666);
            Socket soc = sos.accept();

            DataInputStream din = new DataInputStream(soc.getInputStream());
            DataOutputStream dout = new DataOutputStream(soc.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String s1 = "", s2 = "";

            while (!s1.equals("stop")) 
            {
                s1 = din.readUTF();
                System.out.println("Client Says:  " + s1);
                s2 = br.readLine();
                dout.writeUTF(s2);
                dout.flush();

            }
            din.close();
            soc.close();
            sos.close();
            
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}

