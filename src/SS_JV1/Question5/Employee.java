package SS_JV1.Question5;

public class Employee {

    private String firstName;
    private String lastname;
    private int age;
    private String designation;

    // default constructor
    public Employee() {
        this.age = 0;
        this.designation = "";
        this.firstName = "";
        this.lastname = "";
    }

    // Parameterized constructor
    public Employee(String firstName, String lastname, int age, String designation) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
        this.designation = designation;
    }

    // Copy constructor
    public Employee(Employee other) {
        this.firstName = other.firstName;
        this.lastname = other.lastname;
        this.age = other.age;
        this.designation = other.designation;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "SS_JV1.Question5.Employee details: " +
                "Name : " + firstName + " " + lastname +
                ", Age : " + age +
                ", Designation : " + designation;
    }

    public static void main(String[] args) {

    }
}
