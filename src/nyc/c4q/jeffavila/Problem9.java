package nyc.c4q.jeffavila;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Problem9 {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("write something");
    String input = scanner.nextLine();

        System.out.println("Co*e found: " + countCode(input) + " times");
        }


public static int countCode(String input) {
        int count = 0;
        String regex = "(co[a-zA-Z]e)";
        Pattern p = Pattern.compile(regex);
        Matcher r = p.matcher(input);

        while(r.find())
        count++;

        return count;
        }
        }