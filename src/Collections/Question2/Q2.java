package Collections.Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {

        List<Employee1> emp = new ArrayList<>();

        emp.add(new Employee1(22.00, 15000.00, "Krish Aggarwal"));
        emp.add(new Employee1(23.00, 25000.00, "Ishmeet Singh"));
        emp.add(new Employee1(25.00, 35000.00, "Dushyant Singh"));

        Collections.sort(emp);
        System.out.println("Sorted by name: ");
        for (Employee1 e : emp) {
            System.out.println(e);
        }

        Collections.sort(emp, new SalaryCompare());
        System.out.println("\nSorted by salary");
        for (Employee1 e : emp) {
            System.out.println(e);
        }
    }
}
