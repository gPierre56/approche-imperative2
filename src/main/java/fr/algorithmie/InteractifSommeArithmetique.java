package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un nombre compris");
		int valeur = sc.nextInt();
		int total = 0;
		
		for (int i = 2; i < valeur; i++) {
			total = total +i;
		}
		
		System.out.println(total);

	}

}
