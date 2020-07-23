public class System_Restart
{
    public static void main(String[] args)throws Exception
    {
        //It Will Restart your System (-s)
        Runtime.getRuntime().exec("shutdown -r -t 0");
    }
}