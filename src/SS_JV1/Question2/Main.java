package SS_JV1.Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input;
        StringBuilder sb  = new StringBuilder();

        System.out.println("Enter text (type XDONE to finish) : ");

        while (true) {
            input = sc.nextLine();

            if(input.equals("XDONE")) {
                break;
            }
            sb.append(input).append("\n");
        }
        System.out.println("Entered text : ");
        System.out.println(sb);

        sc.close();
    }
}
