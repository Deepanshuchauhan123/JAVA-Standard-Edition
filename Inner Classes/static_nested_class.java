/*
Static Nested Class:: 

A static class i.e. created inside a class is called static nested class in java. It cannot access non-static data members and methods. 
It can be accessed by outer class name.
*/

public class static_nested_class
{
    static int data = 10;

    public static void main(String[] args) 
    {
        static_nested_class.static_class obj = new static_nested_class.static_class();
        obj.msg();
    }

    static class static_class 
    {
        void msg() 
        {
            System.out.println(data);
        }
    }
}