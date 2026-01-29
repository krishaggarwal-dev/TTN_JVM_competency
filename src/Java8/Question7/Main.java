package Java8.Question7;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int res = list.stream().filter(e -> e>5).mapToInt(e -> e).sum();
        System.out.println("sum of integers greater than 5 are: " + res);
    }
}
