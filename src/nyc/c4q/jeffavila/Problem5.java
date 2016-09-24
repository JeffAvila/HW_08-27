package nyc.c4q.jeffavila;

public class Problem5 {
    public static void main(String[] args){

        System.out.println(chessBoard(8));
    }
    public static String chessBoard(int number){

        String board = "";

        for (int j = 0; j < number ; j++) {
            if (j % 2 == 0){
                board += " ";
            }
            for (int i = 0; i < number; i++) {
                if (i % 2 == 0) {
                    board += "#";
                } else {
                    board += " ";
                }
            }
            board += "\n";
        }
        return board;
    }
}