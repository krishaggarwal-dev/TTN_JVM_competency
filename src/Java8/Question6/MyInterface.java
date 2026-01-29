package Java8.Question6;

public interface MyInterface {

    void show();

    default void defaultMethod() {
        System.out.println("Default Method");
    }

    static void staticMethod() {
        System.out.println("Static Method");
    }
}
