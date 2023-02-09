import java.util.Scanner;

public class RockScissorsPaper {

    private static String userChoice, computerChoice;
    private static final String choice1 = "kamien";
    private static final String choice2 = "nozyce";
    private static final String choice3 = "papier";

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Wpisz jedną z opcji: " + choice1 + ", " + choice2 + ", " + choice3);
            userChoice = scan.nextLine();
        }
        while (!userChoice.equals(choice1) && !userChoice.equals(choice2) && !userChoice.equals(choice3));

        System.out.println("Komputer wybral " + genRandNum() + ". " + "Gracz wybrał " + userChoice + ". ");
        System.out.println(whosTheWinner());
    }

    public static String genRandNum(){
        byte randomNumber = (byte) (Math.random() * 3);
        if (randomNumber == 0) {
            computerChoice = choice1;
        } else if (randomNumber == 1) {
            computerChoice = choice2;
        } else {
            computerChoice = choice3;
        }
        return computerChoice;
    }

    public static String whosTheWinner() {
        String winner;
        if (userChoice.equals(computerChoice)) {
            winner = "Remis";
        }
        else if ((userChoice.equals(choice1) && computerChoice.equals(choice2))
                || (userChoice.equals(choice2) && (computerChoice.equals(choice3))
                || (userChoice.equals(choice3) && (computerChoice.equals(choice1))))) {
            winner = "Wygral gracz";
        }
        else {
            winner = "Wygral komputer";
        }
        return winner;

        }
}
