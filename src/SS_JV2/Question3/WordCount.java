package SS_JV2.Question3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file path");
        String filePath = sc.next();
        System.out.println("Enter word to be searched");
        String word = sc.next();

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            int wordCount = 0;
            String x;

            while ((x = br.readLine()) != null) {
                String[] words = x.split(" ");

                for (String w : words) {
                    if (w.equalsIgnoreCase(word)) {
                        wordCount++;
                    }
                }
            }
            System.out.println("Frequency of " + word + " is " + wordCount);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
