package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] tab = new int[1];

		int choix;
		int i = 0;

		do {
			System.out.println("***** Choisissez une action *****");
			System.out.println("1 - Ajouter un nombre");
			System.out.println("2 - Afficher les nombres");
			choix = sc.nextInt();

			if (choix == 1) {

				System.out.println("***** Renseignez le nombre à ajouter *****");
				int nb = sc.nextInt();
				if (i == tab.length) {
					int[] tmp = new int[tab.length + 1];

					for (int j = 0; j < tab.length; j++) {

						tmp[j] = tab[j];
					}
					tab = tmp;
					tab[i] = nb;
				} else {

					tab[i] = nb;
				}
				i++;
			}

			if (choix == 2) {
				for (int j = 0; j < tab.length; j++) {
					System.out.println(tab[j]);
				}
			}
		} while ((choix == 1) || (choix == 2));

	}

}
