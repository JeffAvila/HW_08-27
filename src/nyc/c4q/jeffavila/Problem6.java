package nyc.c4q.jeffavila;


import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a food");
        String input = scanner.nextLine();
        String lowerCaseFood = input.toLowerCase();



            compareFood(lowerCaseFood);
        }


        public static void compareFood (String lowerCaseFood){
            if (lowerCaseFood.charAt(0) == 'h') {
                System.out.println("Yum");
            } else {
                System.out.println("Yuck");
            }
        }
}
