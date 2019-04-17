package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		int[] arrayCopy = new int[array.length];

		int j = array.length-1;

		for (int i = 0; i < arrayCopy.length; i++) {

			arrayCopy[i] = array[j];
			j--;
		}
		
		System.out.println("***** Affichage ordre normal *****");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("***** Affichage ordre inversé *****");

		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.println(arrayCopy[i]);
		}

	}

}
