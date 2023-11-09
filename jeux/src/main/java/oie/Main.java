package oie;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int totalSimulations = 0;

        while (true) {
            int totalCases = 20;
            int remainingCases;

            do {
                remainingCases = totalCases;

                for (int i = 0; i < 5; i++) {
                    int diceRoll = random.nextInt(6) + 1;
                    remainingCases -= diceRoll;

                    System.out.println("Lancer de dé : " + diceRoll);
                    System.out.println("Cases restantes : " + remainingCases);

                    if (remainingCases == 0) {
                        System.out.println("Félicitations, vous avez gagné!");
                        totalSimulations++;
                        break;
                    } else if (remainingCases < 0) {
                        System.out.println("Dommage, vous avez perdu. Réessayez.");
                        break;
                    }

                    if (i == 4) {
                        System.out.println("Vous n'avez pas atteint 20 cases en 5 lancers. Réessayez.");
                    }
                }

                if (remainingCases == 0) {
                    break;
                }

            } while (true);

            System.out.println("Nombre total de simulations : " + totalSimulations);
            break;
        }
    }
}
