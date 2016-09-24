package nyc.c4q.jeffavila;

/**
 * Created by c4q on 9/3/16.
 */
public class Problem11 {

        public static void main(String[] args) {
            String testString = "This is a test string";
            changeString(testString, 'a');
        }

        public static void changeString(String input, char letter) {

            int end = input.length();
            int start = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == letter) {
                    start = i;
                }
            }
            System.out.println(input.substring(start, end));
        }
    }
