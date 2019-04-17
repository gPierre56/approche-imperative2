package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez entrer un nombre");
		
		int nb = sc.nextInt();
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i+nb);
		}
	}

}
