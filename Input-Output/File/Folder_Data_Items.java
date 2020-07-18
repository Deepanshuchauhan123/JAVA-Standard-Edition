import java.io.File;

public class Folder_Data_Items{
    public static void main(String args[]) {

        File f = new File("C:\\Java SE");
        String filenames[] = f.list();
        for (String filename : filenames) {
            System.out.println(filename);
        }
    }
}

/*
Output::

 myfile.txt
.git
Exception Handling
Inner Classes
Input-Output
Myworld.txt

*/