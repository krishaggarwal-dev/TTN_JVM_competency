package Collections.Question2;

import java.util.Comparator;

public class SalaryCompare implements Comparator<Employee1> {


    @Override
    public int compare(Employee1 e2, Employee1 e3) {
        return e2.salary.compareTo(e3.salary);
    }
}
