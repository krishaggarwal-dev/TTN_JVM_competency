package Java8.Question2;

public class Main {
    public static void main(String[] args) {

        Intop op = new Intop();
        Arithmetic addition = op::add;
        Arithmetic subtract = op::sub;
        Arithmetic mul = Intop::multiply;

        System.out.println("addition = " + addition.operations(5, 4));
        System.out.println("subtraction = " + subtract.operations(5, 4));
        System.out.println("multiplication = " + mul.operations(5, 4));
    }
}
