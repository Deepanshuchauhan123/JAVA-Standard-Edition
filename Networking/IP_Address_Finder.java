
import java.net.InetAddress;

public class IP_Address_Finder
{
    public static void main(String[] args)
    {
        try
        {
            InetAddress ip=InetAddress.getByName("www.Google.com");

            System.out.println("Host Name :  "+ip.getHostName());
            System.out.println("Ip Address:  "+ip.getHostAddress());

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

