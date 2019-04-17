package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int valeur;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Veuillez entrer un nombre.");
			valeur = sc.nextInt();
			if (max < valeur) {
				max = valeur;
			}
		}
		
		System.out.println("Le max est : " + max);

	}

}
