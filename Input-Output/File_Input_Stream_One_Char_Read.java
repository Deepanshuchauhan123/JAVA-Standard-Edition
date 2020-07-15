import java.io.FileInputStream;

public class File_Input_Stream_One_Char_Read
{
    public static void main(String[] args) 
    {
        	try {
            
            		//Required a file having data
            		FileInputStream fin = new FileInputStream("C:\\Java SE\\Text.txt");
            
           		//Read only one char as it gets Ascii value, so we need to typecast it to Char
            		int i = fin.read();
            		System.out.print((char) i);

	               fin.close();

        	} catch (Exception e) 
	{
            		System.out.println(e);
        	}
    }
}