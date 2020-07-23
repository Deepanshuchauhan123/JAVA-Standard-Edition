public class System_Shutdown
{
    public static void main(String[] args)throws Exception
    {
        //It Will Restart your System (-s)
        Runtime.getRuntime().exec("shutdown -s -t 0");
    }
}