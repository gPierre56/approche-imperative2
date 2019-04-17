package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] tab = { 6, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 6 };
		
		
		boolean flag = false;
		
		if ((tab.length >=1) && (tab[0] == tab[tab.length-1])) {
			flag = true;
		}
		
		System.out.println(flag);
		
	}

}
