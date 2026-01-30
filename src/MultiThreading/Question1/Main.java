package MultiThreading.Question1;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        try {
            for (int i=0; i<=5; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
                Thread.sleep(800);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        try {
            for (int i=6; i<=10; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
                Thread.sleep(900);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable, "Runnable-thread");

        MyThread t2 = new MyThread();
        t2.setName("Thread_class-thread");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Main thread ends");
    }
}
