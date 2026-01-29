package Java8.Question9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee("Krish Kumar Aggarwal", 3000L, "Delhi"),
                new Employee("Ishmeet Kumar Singh", 2000L, "Agra"),
                new Employee("Sanyam Kumar Aggarwal", 4000L, "Delhi"),
                new Employee("Pratham Kumar Aggarwal", 7000L, "Delhi")
        );

        List<String> res = list.stream()
                .filter(e -> e.salary < 5000)
                .filter(e -> "delhi".equalsIgnoreCase(e.city))
                .map(e -> e.fullName.split(" ")[0])
                .distinct()
                .collect(Collectors.toList());

        System.out.println(res);
    }
}
