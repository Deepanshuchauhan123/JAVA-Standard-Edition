import java.io.*;
import java.net.Socket;

public class MyClientChat
{
    public static void main(String[] args) 
    {
        try 
        {

            Socket soc = new Socket("localhost", 6666);

            DataInputStream din = new DataInputStream(soc.getInputStream());
            DataOutputStream dout = new DataOutputStream(soc.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String s1 = "", s2 = "";

            while (!s1.equals("stop")) 
            {
                s1 = br.readLine();
                dout.writeUTF(s1);
                dout.flush();
                s2 = din.readUTF();
                System.out.println("Server Says:  " + s2);

            }
            dout.close();
            soc.close();

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

