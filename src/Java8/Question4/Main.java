package Java8.Question4;

public class Main {
    public static void main(String[] args) {

        CharToString c = String::new;
        String str = c.convert(new char[] {'k', 'r', 'i', 's', 'h'});
        System.out.println(str);
    }
}
