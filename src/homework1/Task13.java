package homework1;

import java.util.Random;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter r(rock) p(paper), s(scissors)");
        String player = input.nextLine();
        String computerChoice = computerPick();
        System.out.println("Computer choice: " + computerChoice + " Your choice: " + player);
        whoWinCheck(player, computerChoice);
    }

    private static String computerPick() {
        Random random = new Random();
        int computer = random.nextInt(3);
        String computerChoice = switch (computer) {
            case 0 -> "r";
            case 1 -> "p";
            case 2 -> "s";
            default -> "";
        };
        return computerChoice;
    }

    private static void whoWinCheck(String player, String computerChoice) {
        if (player.equals(computerChoice)) {
            System.out.println("draw");
        } else {
            boolean playerWon = switch (player) {
                case "r" -> computerChoice.equals("s");
                case "p" -> computerChoice.equals("r");
                case "s" -> computerChoice.equals("p");
                default -> {
                    System.out.println("Player fault");
                    yield false;
                }
            };

            if (playerWon) {
                System.out.println("Player won");
            } else {
                System.out.println("Player lose");
            }
        }
    }
}
