/*
ThreadGroup ::
Java provides a convenient way to group multiple threads in a single object.
In such way, we can suspend, resume or interrupt group of threads by a single method call.
*/



public class Thread_Group implements Runnable 
{
    public static void main(String[] args) 
    {
        Thread_Group runnable = new Thread_Group();

        ThreadGroup tg1 = new ThreadGroup("Head Thread");


        //constructor parameters are ( thread group name, class obj.,current thread name)
        Thread t1 = new Thread(tg1, runnable, "Thread One");
        t1.start();
        Thread t2 = new Thread(tg1, runnable, "Thread One");
        t2.start();
        Thread t3 = new Thread(tg1, runnable, "Thread One");
        t3.start();

        //Thread Group name
        System.out.println("Thread Group Name is : " + tg1.getName());

        //It will list Thread Group all information
        tg1.list();
    }

    @Override
    public void run() 
    {
        System.out.println(Thread.currentThread().getName());
    }
}