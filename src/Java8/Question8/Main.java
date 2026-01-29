package Java8.Question8;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional<String> op = Optional.of("Krish");
        if(op.isPresent()) {
            System.out.println("Name: " + op.get());
        }

        op.ifPresent(n -> System.out.println("Length: " + n.length()));
    }
}
