public class Memory
{
    public static void main(String[] args) throws Exception 
    {
        Runtime r = Runtime.getRuntime();
        System.out.println("Total Memory: " + r.totalMemory());
        System.out.println("Total Free memory: " + r.freeMemory());
    }
}