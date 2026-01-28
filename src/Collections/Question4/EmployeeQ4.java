package Collections.Question4;

import java.util.Objects;

public class EmployeeQ4 {

    String name;
    int age;
    String designation;

    public EmployeeQ4(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeQ4 that = (EmployeeQ4) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(designation, that.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }

    @Override
    public String toString() {
        return name + ", age: " + age + ", designation: " + designation;
    }
}
