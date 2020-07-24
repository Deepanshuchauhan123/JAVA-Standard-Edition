class Table 
{
    public void printTable(int n) 
    {
        //This is sync. block for a particular block of code
        synchronized (this) 
        {

            for (int i = 1; i <= 5; i++) 
            {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Sync_Block_Using_Annonymous_Class 
{
    public static void main(String[] args) 
    {

        final Table obj = new Table();
        Thread thread1 = new Thread() 
        {
            public void run() 
            {
                obj.printTable(5);
            }
        };
        Thread thread2 = new Thread() 
        {
            public void run() 
            {
                obj.printTable(100);
            }
        };
        thread1.start();
        thread2.start();

    }
}

