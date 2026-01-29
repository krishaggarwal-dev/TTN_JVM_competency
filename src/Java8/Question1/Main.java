package Java8.Question1;

public class Main {
    public static void main(String[] args) {

        CompareInt ci = (a, b) -> a > b;
        IncrementByOne i = (a) -> a + 1;
        StringConcatenation sc = (s1, s2) -> s1.concat(s2);
        StringConverter uc = (s) -> s.toUpperCase();

        System.out.println(ci.Comparing(3, 6));
        System.out.println(i.increment(4));
        System.out.println(sc.concatenator("Kri", "sh"));
        System.out.println(uc.upperCase("krish"));
    }
}
