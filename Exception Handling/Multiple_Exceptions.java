/*
If try block contains two or more exceptions. But at a time only one 
exception occurs and its corresponding catch block is invoked.
*/

public class Multiple_Exceptions{

    public static void main(String[] args)
    {
        try {
                int array[]=new int[5];
                System.out.println(10 / 0);
                System.out.println(array[10]);
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