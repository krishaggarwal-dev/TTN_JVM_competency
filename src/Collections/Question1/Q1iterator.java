package Collections.Question1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q1iterator {
    public static void main(String[] args) {

        List<Float> res = new ArrayList<>();

        res.add(5.5f);
        res.add(1.5f);
        res.add(4.5f);
        res.add(2.5f);
        res.add(3.5f);

        float sum = 0.0f;

        Iterator<Float> it = res.iterator();

        while (it.hasNext()) {
            sum += it.next();
        }
        System.out.println("Sum of numbers in list using iterator: " + sum);
    }
}
