package Beyond_Java8.Question9;

import java.util.Objects;

record Student(int id, String name, String standard) {

    public Student {
        Objects.requireNonNull(name, "name cannot be null");
        Objects.requireNonNull(standard, "standard cannot be null");
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Krish", "12th");
        Student s2 = new Student(1, "Krish", "12th");

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());
    }
}

