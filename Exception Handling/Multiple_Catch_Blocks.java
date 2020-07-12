public class Multiple_Catch_Blocks{

    public static void main(String[] args) 
    {
        try {
                System.out.println(10 / 0);
            } catch (ArrayIndexOutOfBoundsException e) 
            {
                System.out.println(e);
            } catch (ArithmeticException e) 
            {
                System.out.println(e);
            } catch (Exception e) 
            {
                System.out.println("PArent of all exception : " + e);
            }
            System.out.println("Rest of the Code");
    }
}