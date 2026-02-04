package Beyond_Java8.Question4;

public class Main {
    public static void main(String[] args) {

        String s1 = "Krish";
        System.out.println("repeat(): " + s1.repeat(3));

        String s2 = "   Krish   ";
        System.out.println("trim(): " + s2.trim());
        System.out.println("strip(): " + s2.strip());

        String s3 = "   ";
        System.out.println("isBlank(): " + s3.isBlank());

        String s4 = "Hello World";
        System.out.println("indent():" + s4.indent(4));

        String s5 = "Krish";
        String result = s5.transform(str -> str.toUpperCase());
        System.out.println("transform(): " + result);

        String textBlock = """
                Line 1
                    Line 2
                Line 3
                """;
        System.out.println("stripIndent():" + textBlock.stripIndent());

        String s6 = "Hello\\nWorld\\t2026";
        System.out.println("translateEscapes():");
        System.out.println(s6.translateEscapes());

        String s7 = "Name: %s, Age: %d";
        System.out.println("formatted(): " + s7.formatted("Krish", 22));
    }
}
