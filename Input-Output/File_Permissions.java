
import java.io.FilePermission;
import java.io.IOException;
import java.security.PermissionCollection;

public class File_Permissions
{
    public static void main(String[] args) throws IOException
    {
        String path="C:\\Java SE\\Text.txt";
        
        FilePermission file1 = new FilePermission("C:\\Java SE\\*", "read");
        
        PermissionCollection permission=file1.newPermissionCollection();
        permission.add(file1);
        
        FilePermission file2 = new FilePermission(path, "write");
        permission.add(file2);
        
        if(permission.implies(new FilePermission(path,"read")))
        {
            System.out.println("Read, Write permission is granted for the path "+path );
        }else 
            {
            System.out.println("No Read, Write permission is granted for the path "+path);            }
            }

}