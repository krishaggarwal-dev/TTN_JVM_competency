package SS_JV2.Question2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try(FileWriter fw = new FileWriter("users.txt", true)) {
            while (true) {
                System.out.println("First name: ");
                String firstName = sc.nextLine();

                System.out.println("Last Name: ");
                String lastName = sc.nextLine();

                System.out.println("Age: ");
                int age = Integer.parseInt(sc.nextLine());

                System.out.println("Phone Number: ");
                String phoneNumber = sc.nextLine();

                User user = new User(firstName, lastName, age, phoneNumber);

                fw.write(user.toString());
                fw.write(System.lineSeparator());
                fw.flush();

                System.out.println("Do you want to continue creating users? (Type QUIT to exit)");
                String choice = sc.nextLine();
                if(choice.equalsIgnoreCase("QUIT")) {
                    break;
                }
            }
        } catch(IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        sc.close();
    }
}
