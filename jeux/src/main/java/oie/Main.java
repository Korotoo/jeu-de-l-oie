package oie;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int totalSimulations = 0;
        int somme; 

        do {
            somme = 0; 

            for (int i = 0; i < 5; i++) {
                int lancer = random.nextInt(6) + 1; 
                System.out.println("Lancer " + (i + 1) + ": " + lancer);
                somme += lancer;
            }

            System.out.println("Somme finale : " + somme);

            String resultat = (somme == 20) ? "Gagné" : "Perdu";
            System.out.println("Résultat : " + resultat);

            totalSimulations++;

        } while (somme != 20); 

        System.out.println("Nombre total de simulations pour gagner : " + totalSimulations);
    }
}
