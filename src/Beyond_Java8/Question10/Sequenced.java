package Beyond_Java8.Question10;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.SequencedSet;

public class Sequenced {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.addFirst("B");
        list.addLast("C");
        list.addFirst("A");

        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println(list);

        List<String> reversedList = list.reversed();
        System.out.println(reversedList);

        SequencedSet<Integer> set = new LinkedHashSet<>();

        set.addFirst(20);
        set.addLast(30);
        set.addFirst(10);

        System.out.println(set);

        System.out.println(set.getFirst());
        System.out.println(set.getLast());

        set.removeFirst();
        set.removeLast();

        System.out.println(set);

        SequencedSet<Integer> reversedSet = set.reversed();
        System.out.println(reversedSet);
    }
}

