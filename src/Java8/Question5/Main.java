package Java8.Question5;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> p =(a) -> a > 0;
        Consumer<String> c = System.out::println;
        Function<Integer, Integer> f = (a) -> a*2;
        Supplier<Double> pi = () -> Math.PI;

        System.out.println("Predicate - " + p.test(5));
        System.out.print("Consumer - ");
        c.accept("Krish");
        System.out.println("Function - " + f.apply(5));
        System.out.println("Supplier - " + pi.get());
    }
}
