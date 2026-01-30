package MultiThreading.Question4;

class Krish extends Thread {
    private final Object Lock1;
    private final Object Lock2;

    Krish(Object Lock1, Object Lock2) {
        this.Lock1 = Lock1;
        this.Lock2 = Lock2;
    }

    @Override
    public void run() {
        synchronized (Lock1) {
            System.out.println("krish acquired Lock1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("krish waiting for Lock2");
            synchronized (Lock2) {
                System.out.println("krish acquired Lock2");
            }
        }
    }
}

class Sanyam extends Thread {
    private final Object Lock1;
    private final Object Lock2;

    Sanyam(Object Lock1, Object Lock2) {
        this.Lock1 = Lock1;
        this.Lock2 = Lock2;
    }

    @Override
    public void run() {
        synchronized (Lock2) {
            System.out.println("sanyam acquired Lock2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("sanyam waiting for Lock1");
            synchronized (Lock1) {
                System.out.println("sanyam acquired Lock1");
            }
        }
    }
}

public class Deadlock {
    public static void main(String[] args) {

        Object Lock1 = new Object();
        Object Lock2 = new Object();

        Krish d1 = new Krish(Lock1, Lock2);
        Sanyam r1 = new Sanyam(Lock1, Lock2);

        d1.start();
        r1.start();
    }
}
