/*
File Navigation::

	mkdir() -->It is used to creating a single Directory.
	mkdirs() -->It is used to create multiple Directorys.
*/

import java.io.*;

public class File_Navigation
{
    public static void main(String[] args)
    {

        //For Creating a Single Directory we use mkdir()

        File f = new File("C:\\Java SE\\Directory");

        //Checking whether already exist or not
        if (!f.exists())
        {
            //Creating Directory
            if (f.mkdir()) 
            {
                System.out.println("Single Directory Created Successfully");
            } else {
                System.out.println("Failed to create Single Directory");
            }
        }else{
            System.out.println("Already Exist !!");
        }

        //For Creating Multiple Directory we use mkdirs()

        File f1 = new File("C:\\Java SE\\Multiple Directory\\File\\F1");

        if (!f1.exists()) 
        {
            if (f1.mkdirs()) 
            {
                System.out.println("Multiple Directorys Created Successfully");
            } else {
                System.out.println("Failed to create Multiple Directorys");
            }
        }else{
            System.out.println("Already Exist !!");
        }

    }

}