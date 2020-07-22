/*
Multi-Threading ::

	This is the first method to multi threading by extending Thread Class. 
*/



public class Multi_Threading_Using_extends_Thread extends Thread
{
    // run() will call when thread start's
    public void run()
    {
        System.out.println("Thread is Running");
    }

    public static void main(String[] args)
    {
     
    // This is Creating a Thread
    Multi_Threading_Using_extends_Thread thread1=new Multi_Threading_Using_extends_Thread();

    //Starting the Thread
    thread1.start();

    }
}