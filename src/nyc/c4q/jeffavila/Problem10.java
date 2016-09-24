package nyc.c4q.jeffavila;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Problem10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("It's vowel counting time, write something");
        String input = scanner.nextLine();

        System.out.println("Counted vowels: " + countVowels(input) + " vowels");
    }


    public static int countVowels(String input) {


        int count = 0;
        String regex = "([a|e|i|o|u])";
        Pattern p = Pattern.compile(regex);
        Matcher r = p.matcher(input);

        while (r.find()) {
            count++;
        }

        return count;
    }
}