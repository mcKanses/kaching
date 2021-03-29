import java.util.Scanner;

public class Kaching {
    private static void runTurns (int countTurns) {
        for (int i = 1; i <= countTurns; i++) {
            // ternary approach
            System.out.println(i % 3 == 0 ? i % 15 == 0 ? "ka-ching!" : "ka" : i % 5 == 0 ? "ching!" : i);

            // alternative 1
            /*
            if (i % 3 == 0 && i % 15 != 0) System.out.println("ka");
            if (i % 15 == 0 && i % 3 != 0) System.out.println("ching!");
            if (i % 3 == 0 && i % 15 == 0) System.out.println("ka-ching!");
            if (i % 3 != 0 && i % 15 != 0) System.out.println(i);
             */

            // alternative 2
            /*
            if (i % 3 == 0 && i % 15 == 0) {
                    System.out.println("ka-ching!");
            } else if (i % 3 == 0 || i % 5 == 0){
                if (i % 3 == 0) System.out.println("ka");
                if (i % 5 == 0) System.out.println("ching!");
            } else {
                System.out.println(i);
            }
            */
        }
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String inputValue;

        System.out.print("Please type in the number of turns -> ");

        while (!input.hasNextInt()) {
            System.out.print("Please type in a valid number! -> ");
            inputValue = input.next();
        }

        runTurns(Integer.parseInt(input.next()));
    }
}
