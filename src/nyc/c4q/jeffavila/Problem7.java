package nyc.c4q.jeffavila;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Write something");
        String userInput = scanner.nextLine();

        checkLength(userInput);
    }

    public static void checkLength(String userInput) {

        String modifier = "queens";

        if(userInput.length() == modifier.length()) {
            System.out.println(userInput);
        } else {
            System.out.println(userInput.substring(0,3) + "..." + userInput.substring(userInput.length()-1));
        }
    }
}
