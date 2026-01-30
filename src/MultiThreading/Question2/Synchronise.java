package MultiThreading.Question2;

class Printer {

    public synchronized void methodPrint(String name) {
        for (int i=1; i<=3; i++) {
            System.out.println(name + " printing (method) page " + i);
            sleep();
        }
    }

    public void blockPrint(String name) {
        synchronized (this) {
            for (int i=1; i<=3; i++) {
                System.out.println(name + " printing (block) page " + i);
                sleep();
            }
        }
    }

    private void sleep() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Employee extends Thread {
    Printer printer;
    boolean useMethod;

    Employee(Printer printer, boolean useMethod, String name) {
        super(name);
        this.printer = printer;
        this.useMethod = useMethod;
    }

    @Override
    public void run() {
        if (useMethod) {
            printer.methodPrint(getName());
        } else {
            printer.blockPrint(getName());
        }
    }
}

public class Synchronise {
    public static void main(String[] args) {

        Printer print = new Printer();
        Employee e1 = new Employee(print, true, "Krish");
        Employee e2 = new Employee(print, true, "Sanyam");
        Employee e3 = new Employee(print, false, "Pratham");
        Employee e4 = new Employee(print, false, "Navya");

        e1.start();
        e2.start();
        e3.start();
        e4.start();
    }
}
