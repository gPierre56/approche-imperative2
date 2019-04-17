package fr.algorithmie;

public class ExempleTriParSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };
		int min = array2[0];
		int index = 0;

		for (int i = 0; i < array2.length - 1; i++) {
			min = array2[i];

			for (int j = i + 1; j < array2.length; j++) {

				if (array2[j] < min) {
					min = array2[j];
					index = j;
				}

			}
			if (array2[i] > min) {
				array2[i] = array2[i] + array2[index];
				array2[index] = array2[i] - array2[index];
				array2[i] = array2[i] - array2[index];
			}
		}

		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}

	}

}
