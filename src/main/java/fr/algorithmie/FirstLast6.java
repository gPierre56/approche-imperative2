package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tab = { 0, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 2 };
		boolean flag = false;

		if ((tab.length>0) &&(tab[tab.length - 1] == 6) || (tab[0] == 6)) {
			flag = true;
		}

		System.out.println(flag);
	}

}
