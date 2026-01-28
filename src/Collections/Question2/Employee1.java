package Collections.Question2;

public class Employee1 implements Comparable<Employee1> {

    Double age;
    Double salary;
    String name;

    public Employee1(Double age, Double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public int compareTo(Employee1 e1) {
        String[] first = this.name.split(" ");
        String[] last = e1.name.split(" ");

        int fn = first[0].compareToIgnoreCase(last[0]);

        if(fn != 0) {
            return fn;
        }
        return first[1].compareToIgnoreCase(last[1]);
    }

    @Override
    public String toString() {
        return name + " , age: " + age + " , salary: " + salary;
    }
}
