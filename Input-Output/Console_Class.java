import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console_Class
{
    public static void main(String[] args) throws IOException
    {

        System.out.println("Enter Your Name: ");
        String s = readline();
        System.out.println("Welcome " + s);
        System.out.println("Enter Password");

        char[] p = readPassword();
        String pass = String.valueOf(p);
        System.out.print("Password is " + pass);
    }

    public static String readline() throws IOException
    {
        if (System.console() != null)
        {
            return System.console().readLine();
        } else
            {
                return new BufferedReader(new InputStreamReader(System.in)).readLine();
            }
    }

    public static char[] readPassword() throws IOException
    {
        if (System.console() != null)
        {
            return System.console().readPassword();
        } else
            {
                return readline().toCharArray();
            }
    }
}