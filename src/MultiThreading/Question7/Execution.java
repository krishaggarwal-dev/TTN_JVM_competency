package MultiThreading.Question7;

import java.util.Arrays;
import java.util.List;
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
        System.out.println(name + " is working on " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(name + " finished work");
    }
}

public class Execution{
    public static void main(String[] args) throws InterruptedException {

        List<Runnable> tasks = Arrays.asList(
                new Task("Krish"),
                new Task("Sanyam"),
                new Task("Pratham"),
                new Task("Navya")
        );

        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
        submitAndWait(singleExecutor, tasks);

        ExecutorService cachedExecutor = Executors.newCachedThreadPool();
        submitAndWait(cachedExecutor, tasks);

        ExecutorService fixedExecutor = Executors.newFixedThreadPool(2);
        submitAndWait(fixedExecutor, tasks);
    }

    private static void submitAndWait(ExecutorService executor, List<Runnable> tasks)
            throws InterruptedException {

        for (Runnable task : tasks) {
            executor.submit(task);
        }

        executor.shutdown(); // no new tasks
        executor.awaitTermination(10, TimeUnit.SECONDS); // wait for all to finish
        System.out.println("All tasks completed for " + executor.getClass().getSimpleName());
    }
}

