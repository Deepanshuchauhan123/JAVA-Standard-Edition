/*
Directory Listing::
	In this program it will list all the Directory
	present in the Given path to the console.
*/

import java.io.*;

public class Directory_Listing
{
    public static void main(String[] args) 
    {

        String[] array;
        try 
        {

            File f = new File("C:\\Java SE");

            //add all directory to the array of the string
            array = f.list();
            for (String path : array)
            {
                System.out.println(path);
            }

        } catch (Throwable e) 
        {
            e.printStackTrace();
        }
    }
}