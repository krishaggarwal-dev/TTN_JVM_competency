package Beyond_Java8.Question7;

import java.util.stream.Stream;

public class IterateStream {
    public static void main(String[] args) {

        Stream.iterate(1, n -> n <= 5, n -> n + 1)
                .forEach(System.out::println);
    }
}
