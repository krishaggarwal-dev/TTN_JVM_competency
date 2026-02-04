package Beyond_Java8.Question2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMethod {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5);
        System.out.println("List: " + list);

        Set<Integer> set = Set.of(6,7,8);
        System.out.println("Set: " + set);

        Map<Integer, String> map = Map.of(
                1, "Krish",
                2, "Sanyam"
        );
        System.out.println("Map: " + map);
    }
}
