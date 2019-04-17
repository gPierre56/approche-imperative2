package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un nombre compris entre 1 et 10.");
		int valeur = sc.nextInt();
		
		while ((valeur <1)||(valeur>10)) {
			System.out.println("Ce nombre est invalide, recommencez.");
			valeur = sc.nextInt();
		}
		
		for (int i = 1; i < 11; i++) {
			System.out.println(valeur + " * " + i + " = " + (valeur*i));
		}

	}

}
