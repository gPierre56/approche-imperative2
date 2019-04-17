package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int valeur = random.nextInt(100) + 1;

		System.out.println(valeur);

		Scanner sc = new Scanner(System.in);

		System.out.println("Trouvez le bon chiffre");

		int reponse = sc.nextInt();

		while (reponse != valeur) {
			if (reponse < valeur) {
				System.out.println("Plus grand");
				reponse = sc.nextInt();
			}

			else if (reponse > valeur) {
				System.out.println("Plus petit");
				reponse = sc.nextInt();
			}

		}

		System.out.println("Gg wp, le nombre était bien " + valeur);

	}

}
