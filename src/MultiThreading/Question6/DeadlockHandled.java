package MultiThreading.Question6;

import java.util.concurrent.locks.ReentrantLock;

class Krish extends Thread {

    private final ReentrantLock Lock1;
    private final ReentrantLock Lock2;

    Krish(ReentrantLock Lock1, ReentrantLock Lock2) {
        this.Lock1 = Lock1;
        this.Lock2 = Lock2;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (Lock1.tryLock()) {
                    System.out.println("Krish acquired Lock1");
                    Thread.sleep(500);

                    if (Lock2.tryLock()) {
                        try {
                            System.out.println("Krish acquired Lock2");
                            System.out.println("Krish is executing critical section");
                            break;
                        } finally {
                            Lock2.unlock();
                        }
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                if (Lock1.isHeldByCurrentThread()) {
                    Lock1.unlock();
                    System.out.println("Krish released Lock1");
                }
            }
        }
    }
}

class Sanyam extends Thread {

    private final ReentrantLock Lock1;
    private final ReentrantLock Lock2;

    Sanyam(ReentrantLock Lock1, ReentrantLock Lock2) {
        this.Lock1 = Lock1;
        this.Lock2 = Lock2;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (Lock2.tryLock()) {
                    System.out.println("Sanyam acquired Lock2");
                    Thread.sleep(500);

                    if (Lock1.tryLock()) {
                        try {
                            System.out.println("Sanyam acquired Lock1");
                            System.out.println("Sanyam is executing critical section");
                            break; // both locks acquired
                        } finally {
                            Lock1.unlock();
                        }
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                if (Lock2.isHeldByCurrentThread()) {
                    Lock2.unlock();
                    System.out.println("Sanyam released Lock2");
                }
            }
        }
    }
}

public class DeadlockHandled {

    public static void main(String[] args) {

        ReentrantLock Lock1 = new ReentrantLock();
        ReentrantLock Lock2 = new ReentrantLock();

        Krish k = new Krish(Lock1, Lock2);
        Sanyam s = new Sanyam(Lock1, Lock2);

        k.start();
        s.start();
    }
}

