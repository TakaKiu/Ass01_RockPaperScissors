import java.util.Scanner;

class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do {

            String moveA;
            do {
                System.out.print("Player A, enter your move (R/P/S): ");
                moveA = scanner.nextLine().toUpperCase();
            } while (isValidMove(moveA));


            String moveB;
            do {
                System.out.print("Player B, enter your move (R/P/S): ");
                moveB = scanner.nextLine().toUpperCase();
            } while (isValidMove(moveB));

            String result = determineWinner(moveA, moveB);

            System.out.println(result);

            System.out.print("Play again? (Y/N): ");
            playAgain = scanner.nextLine();
        } while (playAgain.equalsIgnoreCase("Y"));
    }

    public static boolean isValidMove(String move) {
        return !move.equals("R") && !move.equals("P") && !move.equals("S");
    }

    public static String determineWinner(String moveA, String moveB) {
        if (moveA.equals(moveB)) {
            return "It's a Tie!";
        } else if ((moveA.equals("R") && moveB.equals("S")) || (moveA.equals("S") && moveB.equals("P"))
                || (moveA.equals("P") && moveB.equals("R"))) {
            return "Player A wins!";
        } else {
            return "Player B wins!";
        }
    }
}