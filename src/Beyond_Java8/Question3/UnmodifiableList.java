package Beyond_Java8.Question3;

import java.util.List;
import java.util.stream.Stream;

public class UnmodifiableList {
    public static void main(String[] args) {

        List<Integer> list = Stream.of(1,2,3,4)
                .toList();

        System.out.println(list);
    }
}
