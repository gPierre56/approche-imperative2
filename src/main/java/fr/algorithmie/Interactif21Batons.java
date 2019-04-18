package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] listeBatons = new int[21];
		int choix = 0;
		boolean flag = false;

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		System.out.println("***** Jeu des 21 batons *****");

		// boucle de jeu

		while (listeBatons.length > 0) {
			System.out.println("Veuillez sélectionner le nombre de batons à retirer (1 à 3)");

			// saisie du joueur
			choix = sc.nextInt();
			while ((choix < 1) && (choix > 3)) {
				System.out.println("Saisie incorrecte, recommencez");
				choix = sc.nextInt();
			}
			if ((choix >= 1) && (choix <= 3) && (listeBatons.length - choix >= 0)) {
				int[] tmp = new int[listeBatons.length - choix];
				listeBatons = tmp;
			}

			if (listeBatons.length > 0) {
				System.out.println("Il reste " + listeBatons.length + "batons");
			}

			else {
				System.out.println("Il n'y a plus de batons, vous avez perdu");
			}

			if (listeBatons.length > 0) {

				// tour de l'adversaire

				System.out.println("L'ordinateur joue :");

				choix = random.nextInt(3) + 1;

				// vérification du choix de l'ordinateur
				// Si premier choix ok, modification batons
				if (listeBatons.length - choix >= 0) {
					int[] tmp = new int[listeBatons.length - choix];
					listeBatons = tmp;
					flag = true;
				}
				// sinon, reroll du random avec 2 choix
				else {
					choix = random.nextInt(2) + 1;
				}

				// si 2eme choix ok, modif tableau

				if ((listeBatons.length - choix >= 0) && !(flag)) {
					int[] tmp = new int[listeBatons.length - choix];
					listeBatons = tmp;
					flag = true;
				}

				// sinon, initialiser choix à 1
				else if (!flag) {
					choix = 1;

				}

				if ((listeBatons.length - choix >= 0) && !(flag)) {
					int[] tmp = new int[listeBatons.length - choix];
					listeBatons = tmp;
					flag = true;
				}

				else if (listeBatons.length > 0) {
					System.out.println("L'adversaire retire " + choix + " batons");
					System.out.println("Il reste " + listeBatons.length + "batons");
				}

				else {
					System.out.println("Il n'y a plus de batons, vous avez gagné");
				}
				flag = false;

			}

		}
	}

}
