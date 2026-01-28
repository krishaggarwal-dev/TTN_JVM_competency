package HandsOn;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public int compareTo(Person p2) {
        int len1 = this.getName().length();
        int len2 = p2.getName().length();

        if(len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        }

        if(this.name.compareTo(p2.name) > 0) {
            return 1;
        }

        if(this.name.compareTo(p2.name) < 0) {
            return -1;
        }

        return 0;
    }
}
