/*
Thread Synchronization ::

If you declare any method as synchronized, it is known as synchronized method.

Synchronized method is used to lock an object for any shared resource.

When a thread invokes a synchronized method, it automatically acquires the lock
for that object and releases it when the thread completes its task.
*/


public class Synchronized_Thread_Method {
    public static void main(String[] args) {

        Table thread=new Table();
        MyThread1 t1=new MyThread1(thread);
        MyThread2 t2=new MyThread2(thread);

        t1.start();
        t2.start();

    }
}

class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(100);
    }
}

class Table {
   synchronized public void printTable(int t) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * t);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

