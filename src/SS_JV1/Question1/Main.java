package SS_JV1.Question1;

public class Main {

    static String firstName = "Krish";
    static String lastName = "Aggarwal";
    static int age = 22;

    static {
        System.out.println("This is static block");
        System.out.println("First name = " + firstName);
        System.out.println("Last Name = " + lastName);
        System.out.println("Age = " + age);
    }

    static void print() {
        System.out.println("This is static method");
        System.out.println("First name = " + firstName);
        System.out.println("Last Name = " + lastName);
        System.out.println("Age = " + age);
    }

    public static void main(String[] args) {

        print();

        System.out.println("This is static variable");
        System.out.println("First name = " + firstName);
        System.out.println("Last Name = " + lastName);
        System.out.println("Age = " + age);
    }
}
