import java.util.Scanner;

public class RockScissorsPaper {

    private static String userChoice, computerChoice;
    private static final String rock = "kamien";
    private static final String scissors = "nozyce";
    private static final String paper = "papier";

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Wpisz jedną z opcji: " + rock + ", " + scissors + ", " + paper);
            userChoice = scan.nextLine();
        }
        while (!userChoice.equals(rock) && !userChoice.equals(scissors) && !userChoice.equals(paper));

        System.out.println("Komputer wybral " + genRandNum() + ". " + "Gracz wybrał " + userChoice + ". ");
        System.out.println(whosTheWinner());
    }

    public static String genRandNum(){
        byte randomNumber = (byte) (Math.random() * 3);
        if (randomNumber == 0) {
            computerChoice = rock;
        } else if (randomNumber == 1) {
            computerChoice = scissors;
        } else {
            computerChoice = paper;
        }
        return computerChoice;
    }

    public static String whosTheWinner() {
        String winner;
        if (userChoice.equals(computerChoice)) {
            winner = "Remis";
        }
        else if ((userChoice.equals(rock) && computerChoice.equals(scissors))
                || (userChoice.equals(scissors) && (computerChoice.equals(paper))
                || (userChoice.equals(paper) && (computerChoice.equals(rock))))) {
            winner = "Wygral gracz";
        }
        else {
            winner = "Wygral komputer";
        }
        return winner;

        }
}
