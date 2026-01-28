package SS_JV1.Question7;

public class Q7 {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        }

        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        finally {
            System.out.println("Finally block");
        }
    }
}
