package fr.algorithmie;

public class TriABulles {

	public static void main(String[] args) {
		
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		 boolean tab_ok = false;
		 
		 while (!tab_ok) {
			tab_ok = true;
			
			for (int i = 0; i < array2.length-1; i++) {
				if (array2[i] > array2[i+1]) {
					array2[i] = array2[i] + array2[i+1];
					array2[i+1] = array2[i] - array2[i+1];
					array2[i] = array2[i] - array2[i+1];
					tab_ok = false;
					
						
				}
			}
		}
		 
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		
		}

	}


