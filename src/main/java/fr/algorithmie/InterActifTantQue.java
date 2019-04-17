package fr.algorithmie;

import java.util.Scanner;

public class InterActifTantQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un nombre compris entre 1 et 10.");
		int valeur = sc.nextInt();
		
		while ((valeur <1)||(valeur>10)) {
			System.out.println("Ce nombre est invalide, recommencez.");
			valeur = sc.nextInt();
		}
		
		System.out.println(valeur);
	}

}
