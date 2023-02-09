import java.util.Scanner;

public class RockScissorsPaper {

    private static String userChoice, computerChoice;

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Wpisz jedną z opcji: kamien, nozyce, papier");
            userChoice = scan.nextLine();
        }
        while (!userChoice.equals("kamien") && !userChoice.equals("nozyce") && !userChoice.equals("papier"));

        System.out.println("Komputer wybral " + genRandNum() + ". " + "Gracz wybrał " + userChoice + ". ");
        System.out.println(whosTheWinner());
    }

    public static String genRandNum(){
        byte randomNumber = (byte) (Math.random() * 3);
        if (randomNumber == 0) {
            computerChoice = "kamien";
        } else if (randomNumber == 1) {
            computerChoice = "nozyce";
        } else {
            computerChoice = "papier";
        }
        return computerChoice;
    }

    public static String whosTheWinner() {
        String winner;
        if (userChoice.equals(computerChoice)) {
            winner = "Remis";
        }
        else if ((userChoice.equals("kamien") && computerChoice.equals("nozyce"))
                || (userChoice.equals("nozyce") && (computerChoice.equals("papier"))
                || (userChoice.equals("papier") && (computerChoice.equals("kamien"))))) {
            winner = "Wygral gracz";
        }
        else {
            winner = "Wygral komputer";
        }
        return winner;

        }
}
