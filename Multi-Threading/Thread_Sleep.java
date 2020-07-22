/*
Thread Sleep::
	This leads to make thread sleep for given time milliseconds.
*/

public class Thread_Sleep implements Runnable
{
    public static void main(String[] args)
    {
        Thread_Sleep thread1 = new Thread_Sleep();

        //We have to create thread Explicitly and passing class object in it.
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread1);


        //Starting the thread
        t1.start();
        t2.start();

    }

    public void run() {
        for (int i = 0; i < 5; i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(i + 1);
        }
    }
}