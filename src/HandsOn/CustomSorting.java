package HandsOn;

import java.util.*;

//class CompareLength implements Comparator<Person> {
//
//    @Override
//    public int compare(Person p1, Person p2) {
//        int len1 = p1.getName().length();
//        int len2 = p2.getName().length();
//
//        if(len1 > len2) {
//            return 1;
//        } else if (len1 < len2) {
//            return -1;
//        }
//        return 0;
//    }
//}

public class CustomSorting {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>();

        set.add(new Person("Krish"));
        set.add(new Person("Ishmeet"));
        set.add(new Person("Trish"));
        set.add(new Person("yo"));

        // List<Person> list = new ArrayList<>(set);
        // Collections.sort(list);

        System.out.println(set);
    }
}
