package fr.tableaux;

public class Exercice1 {

	public static void main(String[] args) {
		
		int[] tab1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(tab1[0]);
		System.out.println(tab1[1]);
		System.out.println(tab1.length);
		
		// l'entier cinq est situé à l'index 4
		
		// si l'ont tente d'afficher l'index 10 cela génère une exception car le tableau va de 0 à 9
		
		tab1[4] = 8;
		
		System.out.println(tab1[4]);

	}

}
