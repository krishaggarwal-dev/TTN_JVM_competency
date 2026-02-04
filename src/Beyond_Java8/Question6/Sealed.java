package Beyond_Java8.Question6;

sealed abstract class Calculator permits Addition, Subtraction, Multiplication {

    public abstract void calculate();
}

final class Addition extends Calculator {
    @Override
    public void calculate() {
        add(5, 5);
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

sealed abstract class Subtraction extends Calculator permits AdvancedSubtraction {

    public void sub(int a, int b) {
        System.out.println(a - b);
    }
}

non-sealed class Multiplication extends Calculator {
    @Override
    public void calculate() {
        multiply(5, 5);
    }

    public void multiply(int a, int b) {
        System.out.println(a * b);
    }
}

final class AdvancedSubtraction extends Subtraction {
    @Override
    public void calculate() {
        sub(5, 5, 5);
    }

    public void sub(int a, int b, int c) {
        System.out.println(a - b - c);
    }
}

public class Sealed {
    public static void main(String[] args) {

        Calculator c1 = new Addition();
        Calculator c2 = new AdvancedSubtraction();
        Calculator c3 = new Multiplication();

        c1.calculate();
        c2.calculate();
        c3.calculate();
    }
}

