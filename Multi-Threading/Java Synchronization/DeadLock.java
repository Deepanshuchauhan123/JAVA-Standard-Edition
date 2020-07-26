public class DeadLock
{
    public static void main(String[] args)
    {
        final String resource1 = "Deepanshu";
        final String resource2 = "Chauhan";

        Thread t1 = new Thread()
        {
            @Override
            public void run()
            {
                synchronized (resource1)
                {
                    System.out.println("Thread 1: Locked Resource 1");

                    try
                    {
                        Thread.sleep(100);
                    } catch (Exception e) {}

                    synchronized (resource2)
                    {
                        System.out.println("Thread 2: Locked Resource 2");
                    }
                }

            }
        };

        Thread t2=new Thread()
        {
            @Override
            public void run()
            {
                synchronized (resource2)
                {
                    System.out.println("Thread 2: Locked resource 2");

                try
                {
                    Thread.sleep(100);
                }catch (Exception e){}
                
                    synchronized (resource1)
                    {
                    System.out.println("Thread 2: Locked resource 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
        
    }
}