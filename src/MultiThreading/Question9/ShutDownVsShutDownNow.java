package MultiThreading.Question9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {
    private String name;

    Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " started on " + Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println(name + " completed");
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted!");
        }
    }
}

public class ShutDownVsShutDownNow {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Shutdown(): ");
        ExecutorService shutdownExecutor = Executors.newFixedThreadPool(2);

        shutdownExecutor.submit(new Task("Task-1"));
        shutdownExecutor.submit(new Task("Task-2"));
        shutdownExecutor.submit(new Task("Task-3"));

        shutdownExecutor.shutdown(); // no new tasks, existing tasks continue
        shutdownExecutor.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("shutdown() finished\n");

        System.out.println("ShutdownNow(): ");
        ExecutorService shutdownNowExecutor = Executors.newFixedThreadPool(2);

        shutdownNowExecutor.submit(new Task("Task-A"));
        shutdownNowExecutor.submit(new Task("Task-B"));
        shutdownNowExecutor.submit(new Task("Task-C"));

        shutdownNowExecutor.shutdownNow();
        shutdownNowExecutor.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("shutdownNow() finished");
    }
}

