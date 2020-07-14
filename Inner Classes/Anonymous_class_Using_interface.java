/*
Java anonymous inner class example using interface.
*/
public class Anonymous_class_Using_interface
{
    public static void main(String[] args)
    {
        //Anonymous class , as it is having no name
        //Here we are not creating object of Interface we are creating anonymous class
       
        Person p = new Person()
        {
          public void eat()
            {
                System.out.println("Fruits");
            }
        };
        p.eat();
    }
}
interface Person
    {
        void eat();
    }