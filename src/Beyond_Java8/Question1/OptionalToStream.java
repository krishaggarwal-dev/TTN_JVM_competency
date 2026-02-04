package Beyond_Java8.Question1;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalToStream {
    public static void main(String[] args) {

        Optional<String> opt = Optional.of("Krish");
        Stream<String> stream = opt.stream();
        stream.forEach(System.out::println);
    }
}
