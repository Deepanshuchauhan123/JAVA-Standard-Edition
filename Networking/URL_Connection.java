/*
URLConnection class :: 

		It represents a communication link between the URL and the application.
		This class can be used to read and write data to the specified resource referred by the URL.
*/





import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URL_Connection
{
    public static void main(String[] args) 
    {
        try {
            URL url = new URL("https://www.javatpoint.com/URLConnection-class");

            URLConnection urlConn = url.openConnection();

            InputStream stream = urlConn.getInputStream();

            int i;
            
            while ((i = stream.read()) != -1) 
            {
                System.out.print((char) i);
            }


        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}