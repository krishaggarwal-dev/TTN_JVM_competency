package HandsOn;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class person {
    private String name;

    public person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}

public class practice {
    public static void main(String[] args) {
        person p1 = new person("Krish");
        person p2 = new person("Ishmeet");
        person p3 = new person("Sanyam");
        person p4 = new person("Krish");

        Set<person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        System.out.println(set);
    }
}
