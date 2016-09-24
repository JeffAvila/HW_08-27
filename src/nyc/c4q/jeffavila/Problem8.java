package nyc.c4q.jeffavila;


public class Problem8 {



    public static void main(String[] args) {
        System.out.println(triangle(8));
    }


    public static String triangle(int size) {
        String triangle = "";
        for (int i = 0; i < size; i++) {
            for (int p = size-i-1; p < size; p++) {
                triangle = triangle + "#";
            }
            triangle = triangle + "\n";
        }
        return triangle;
    }
}