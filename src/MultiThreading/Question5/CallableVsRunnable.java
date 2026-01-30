package MultiThreading.Question5;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable is working...");
    }
}

class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Callable is calculating...");
        Thread.sleep(1000);
        return 10 + 20;
    }
}

public class CallableVsRunnable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Thread t1 = new Thread(new MyRunnable());
        t1.start();

        FutureTask<Integer> task = new FutureTask<>(new MyCallable());
        Thread t2 = new Thread(task);
        t2.start();

        System.out.println("Result from Callable: " + task.get());
    }
}

