import java.net.MalformedURLException;
import java.net.URL;

public class URL_Class
{
    public static void main(String[] args) 
    {
        try 
        {
            URL url = new URL("https://en.wikipedia.org/wiki/Supercar");

            System.out.println("Protocol   : " + url.getProtocol());
             
            System.out.println("Host Name  : " + url.getHost());
            
            System.out.println("Port No.   : " + url.getPort());
            
            System.out.println("File Name  : " + url.getFile());
            
        } catch (MalformedURLException e) 
        {
            e.printStackTrace();
        }
    }
}