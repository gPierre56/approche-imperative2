package fr.tableaux;

public class Exercice2 {
	public static void main(String[] args) {

		int[][] tab2 = new int[2][];
		tab2[0] = new int[] { 8, 9, 10 };
		tab2[1] = new int[] { 1, 2, 17, 4, 8 };
		

		System.out.println(tab2.length);
		System.out.println(tab2[0].length);
		System.out.println(tab2[1].length);
		System.out.println(tab2[tab2.length-1][tab2[tab2.length-1].length-1]);

	}

}
