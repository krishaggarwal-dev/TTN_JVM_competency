package SS_JV1.Question3;

import java.util.Scanner;

public class Q3 {

    static Scanner sc = new Scanner(System.in);
    static final double pi = Math.PI;

    static double area() {
        System.out.println("Enter radius of circle : ");
        double r = sc.nextDouble();
        double area = pi * r * r;
        return area;
    }

    static double circumference() {
        System.out.println("Enter radius of circle : ");
        double r = sc.nextDouble();
        double circum = 2 * pi * r;
        return circum;
    }

    public static void main(String[] args) {

        System.out.println("******Menu******");
        System.out.println("1. Calculate area of circle");
        System.out.println("2. Calculate circumference of circle");
        System.out.println("3. Exit");
        System.out.println("Choose an option (1-3) : ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Area of circle is " + area());
                break;

            case 2:
                System.out.println("Circumference of circle is " + circumference());
                break;

            case 3:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();

    }
}