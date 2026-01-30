package MultiThreading.Question8;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class RandomNumberTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println("Generated number by " + Thread.currentThread().getName() + ": " + number);
        return number;
    }
}

public class FutureRandom {
    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> future = executor.submit(new RandomNumberTask());

        System.out.println("Main thread doing other work");

        Integer result = future.get();

        System.out.println("Random number received from thread: " + result);

        executor.shutdown();
    }
}

