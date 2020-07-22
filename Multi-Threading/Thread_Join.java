/*
Thread join();
	It leads to run a particular thread for given period of time and rest 
	of thread will wait for its execution of time.
*/

public class Thread_Join implements Runnable {
    public static void main(String[] args) {
        Thread_Join thread1 = new Thread_Join();

        //We have to create thread Explicitly and passing class object in it.
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread1);
        Thread t3 = new Thread(thread1);
        t1.start();
        try {
            
                //It will run uninterruptly for given time
                t1.join(3000);
                
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }

        t2.start();
        t3.start();

    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + 1);
        }
    }
}