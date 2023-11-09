package oie;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int totalCases = 20;
        int remainingCases = totalCases;
        int throwsCount = 5;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < throwsCount; i++) {
            System.out.println("Appuyez sur Entrée pour lancer le dé.");
            scanner.nextLine();

            int diceRoll = random.nextInt(6) + 1;
            remainingCases -= diceRoll;

            System.out.println("Lancer de dé : " + diceRoll);
            System.out.println("Cases restantes : " + remainingCases);

            if (remainingCases == 0) {
                System.out.println("Félicitations, vous avez gagné!");
                break;
            } else if (remainingCases < 0) {
                System.out.println("Dommage, vous avez perdu.");
                break;
            }

            if (i == throwsCount - 1) {
                System.out.println("Vous n'avez pas atteint 20 cases en 5 lancers. Essayez à nouveau.");
            }
        }

        scanner.close();
    }
}
