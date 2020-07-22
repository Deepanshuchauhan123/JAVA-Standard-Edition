/*
Deamon Threads are used to provide support to the Non-Deamon Threads or
	user threads, Deamon threads are invisible and provide service 
	to Non-deamon threads as from backend.
*/

public class TestDaemonThread1 extends Thread 
{
    public static void main(String[] args) 
    {
        TestDaemonThread1 t1 = new TestDaemonThread1();//creating thread  
        TestDaemonThread1 t2 = new TestDaemonThread1();
        TestDaemonThread1 t3 = new TestDaemonThread1();

        t1.setDaemon(true);//now t1 is daemon thread  

        t1.start();//starting threads  
        t2.start();
        t3.start();
    }

    public void run() 
    {
        if (Thread.currentThread().isDaemon()) {//checking for daemon thread  
            System.out.println("daemon thread work");
        } else {
            System.out.println("user thread work");
        }
    }
} 