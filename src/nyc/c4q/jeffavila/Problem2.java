package nyc.c4q.jeffavila;


public class Problem2 {
    public static void main(String[] args){

        System.out.println(calculateAge(1980,2016));

    }
    public static String calculateAge(int birthYear, int currentYear){

        int age = currentYear - birthYear;
        int age2 = age -1;

        String answer = "You are either " + age2 + " or " + age;

        return answer;
    }
}