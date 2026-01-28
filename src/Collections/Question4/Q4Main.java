package Collections.Question4;

import java.util.HashMap;
import java.util.Map;

public class Q4Main {

    public static void main(String[] args) {

        Map<EmployeeQ4, Double> map = new HashMap<>();

        EmployeeQ4 e1 = new EmployeeQ4("Krish", 22, "Developer");
        EmployeeQ4 e2 = new EmployeeQ4("ishmeet", 23, "QE");
        EmployeeQ4 e3 = new EmployeeQ4("Dushyant", 25, "DA");

        map.put(e1, 60000.00);
        map.put(e2, 50000.00);
        map.put(e3, 80000.00);

        for (Map.Entry<EmployeeQ4, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> Salary: " + entry.getValue());
        }
    }
}
