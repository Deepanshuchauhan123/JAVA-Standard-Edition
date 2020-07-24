


class Table {
    public void printTable(int n) {
        //This is sync. block for a particular block of code
        synchronized (this) {

            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Thread1 extends Thread {
    Table t;

    Thread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class Thread2 extends Thread {
    Table t;

    Thread2(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(100);
    }
}

public class Sync_Block {
    public static void main(String[] args) {

        Table t1 = new Table();
        Thread1 thread1 = new Thread1(t1);
        Thread2 thread2 = new Thread2(t1);
        thread1.start();
        thread2.start();

    }
}

