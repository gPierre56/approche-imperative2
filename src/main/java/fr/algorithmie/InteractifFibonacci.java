package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] tab = { 0, 1 };

		System.out.println("***** Choisissez un rang *****");

		int rang = sc.nextInt();

		for (int i = 2; i < rang + 1; i++) {

			if (tab.length == i) {
				int tmp[] = new int[tab.length + 1];

				for (int j = 0; j < tab.length; j++) {
					tmp[j] = tab[j];
				}
				tab = tmp;
			}
			tab[i] = tab[i - 1] + tab[i - 2];
		}

		System.out.println(tab[rang - 1]);

	}

}
