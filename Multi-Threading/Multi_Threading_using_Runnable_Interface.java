

public class Multi_Threading_using_Runnable_Interface implements Runnable 
{
    public static void main(String[] args) 
    {
        Multi_Threading_using_Runnable_Interface thread1 = new Multi_Threading_using_Runnable_Interface();
        
        //We have to create thread Explicitly and passing class object in it.
        Thread t1 = new Thread(thread1);
        
        //Getting Thread name
        System.out.println(t1.getName());
        
        //Set the thread name
        t1.setName("My Thread");
        
        System.out.println(t1.getName());
        
        //Getting priority of the thread and bydefault thread priority is 5.
        System.out.println(t1.getPriority());
        
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());

        //Starting the thread
        t1.start();

    }

    public void run() 
    {
        System.out.println("Thread is Running...");
    }
}