package SS_JV1.Question8;

public class Q8 {
    public static void main(String[] args) {

        try {
            Class.forName("Krish");
        } catch (ClassNotFoundException e) {
            System.out.println("class not found exception");
        }
    }
}
