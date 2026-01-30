package MultiThreading.Question3;

class Signal {
    volatile boolean running = true; // volatile variable
}

class WorkerThread extends Thread {
    private Signal data;

    WorkerThread(Signal data) {
        this.data = data;
    }

    @Override
    public void run() {
        System.out.println("Worker thread started");
        while (data.running) {
            // waiting
        }
        System.out.println("Worker thread stopped");
    }
}

public class VolatileUse {
    public static void main(String[] args) throws InterruptedException {

        Signal data = new Signal();
        WorkerThread t = new WorkerThread(data);
        t.start();

        Thread.sleep(2000);
        System.out.println("Main thread changing running to false");
        data.running = false;
    }
}