/*
Anonymous class::
A class that have no name is known as anonymous inner class in java.
It should be used if you have to override method of class or interface.
*/

public class Anonymous_Inner_Class{
    public static void main(String[] args)
    {
        //Anonymous class , as it is having no name

        Person p = new Person()
        {
            void eat()
            {
                System.out.println("Fruits");
            }
        };
        p.eat();
    }

    static abstract class Person
    {
        abstract void eat();
    }
}