import java.util.Scanner;

public class RockScissorsPaper {

    private static String userChoice, computerChoice;
    private static final String ROCK = "kamien";
    private static final String SCISSORS = "nozyce";
    private static final String PAPER = "papier";

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Wpisz jedną z opcji: " + ROCK + ", " + SCISSORS + ", " + PAPER);
            userChoice = scan.nextLine();
        }
        while (!userChoice.equals(ROCK) && !userChoice.equals(SCISSORS) && !userChoice.equals(PAPER));

        System.out.println("Komputer wybral " + genRandNum() + ". " + "Gracz wybrał " + userChoice + ". ");
        System.out.println(whosTheWinner());
    }

    public static String genRandNum(){
        byte randomNumber = (byte) (Math.random() * 3);
        if (randomNumber == 0) {
            computerChoice = ROCK;
        } else if (randomNumber == 1) {
            computerChoice = SCISSORS;
        } else {
            computerChoice = PAPER;
        }
        return computerChoice;
    }

    public static String whosTheWinner() {
        String winner;
        if (userChoice.equals(computerChoice)) {
            winner = "Remis";
        }
        else if ((userChoice.equals(ROCK) && computerChoice.equals(SCISSORS))
                || (userChoice.equals(SCISSORS) && (computerChoice.equals(PAPER))
                || (userChoice.equals(PAPER) && (computerChoice.equals(ROCK))))) {
            winner = "Wygral gracz";
        }
        else {
            winner = "Wygral komputer";
        }
        return winner;

        }
}
