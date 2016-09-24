package nyc.c4q.jeffavila;

public class problem3 {
    public static void main(String[] args){
        System.out.println(sameXo("ooxXm"));
    }
    public static boolean sameXo(String xo){
        boolean isSameCount = false;
        int totalO = 0;
        int totalX = 0;

        for(int i = 0 ; i < xo.length();i++) {
            if (Character.toLowerCase(xo.charAt(i)) == 'x'){
                totalX++;
            }
            if (Character.toLowerCase(xo.charAt(i)) == 'o') {
                totalO++;
            }
        }
        return totalX == totalO;
    }
}