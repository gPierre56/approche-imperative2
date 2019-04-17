package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tab = { 6, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 6 };
		final int DERNIER_INDICE = tab[tab.length - 1];
		int temp = tab[0];

		for (int i = tab.length - 1; i > 0; i--) {

			if (i == 0) {
				tab[i] = DERNIER_INDICE;
			} else {
				temp = tab[i];
				tab[i] = tab[i - 1];
			}

		}
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}

}
