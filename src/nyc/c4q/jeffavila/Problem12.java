package nyc.c4q.jeffavila;


public class Problem12 {
    public static void main(String[] args) {
        playSong();
    }

    public static void playSong() {
        String[] days = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh",
                "Eighth", "Ninth", "Tenth", "Eleventh", "Twelfth"};

        String[] part = new String[12];
        part[0] = "a Partridge in a Pear Tree.";
        part[1] = "Two Turtle Doves";
        part[2] = "Three French Hens";
        part[3] = "Four Calling Birds";
        part[4] = "Five Gold Rings";
        part[5] = "Six Geese a Laying";
        part[6] = "Seven Swans a Swimming";
        part[7] = "Eight Maids a Milking";
        part[8] = "Nine Ladies Dancing";
        part[9] = "Ten Lords a Leaping";
        part[10] = "Eleven Pipers Piping";
        part[11] = "Twelve Drummers Drumming";

        for (int i = 0; i < part.length; i++) {
            System.out.println("On the " + days[i] + " day of Christmas my true love sent to me");
            int k = i;
            for (int j = part.length - i - 1; j < part.length; j++) {
                if (i > 0 && k == 0)
                    System.out.println("and " + part[k]);
                else if (i > 1 && k > 1)
                    System.out.println(part[k] + ",");
                else
                    System.out.println(part[k]);
                k--;
            }
            System.out.println("");
        }
    }
}

