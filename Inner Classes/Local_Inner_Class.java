/*
Local Inner Class ::

A class i.e. created inside a method is called local inner class in java. 
If you want to invoke the methods of local inner class, you must
instantiate this class inside the method.
*/

public class Local_Inner_Class
{
    public static void main(String[] args) 
    {
        Local_Inner_Class obj = new Local_Inner_Class();
        obj.hello();
    }

    public void hello() 
    {
        class Name 
        {
            public void name() 
            {
                System.out.println("Hello Deepanshu");
            }
        }
        Name n = new Name();
        n.name();
    }
}