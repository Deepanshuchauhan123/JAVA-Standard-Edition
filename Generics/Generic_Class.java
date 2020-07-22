public class Generic_Class<T1,T2>
{
    public void display(T1 var1, T2 var2)
    {
        System.out.println("Name: "+var1+"  Roll No. :"+var2);
    }

    public static void main(String[] args)
    {

        Generic_Class<String,Integer> obj1=new Generic_Class<String ,Integer>();
        obj1.display("Deepanshu",8);
    }
}