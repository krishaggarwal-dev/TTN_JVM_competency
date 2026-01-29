package Java8.Question3;

interface A {
    default void show() {
        System.out.println("Interface A");
    }
}

interface B {
    default void show() {
        System.out.println("Interface B");
    }
}

class MyClass implements A,B {

    @Override
    public void show() {
        A.super.show();
        B.super.show();
        System.out.println("My class");
    }
}

public class Main {
    public static void main(String[] args) {

        MyClass c = new MyClass();
        c.show();
    }
}
