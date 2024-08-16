package pratica;

public class BubbleSort {
	public static void bubbleSortCrescente(int lista[]) {
		int tmp;
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length - 1; j++) {
				if (lista[j] > lista[j+ 1]) {
					tmp = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = tmp;
				}
			}
		}
		
	}
	public static void bubbleSortDecrescente(int lista[]) {
		int tmp;
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length - 1; j++) {
				if (lista[j] < lista[j+ 1]) {
					tmp = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = tmp;
				}
			}
		}
		
	}
	public static void bubbleSortPadrao(int[] lista) {
		int n = lista.length;
		boolean trocou;
		for (int i = 0; i < n - 1; i++) {
			trocou = false;
			for (int j = 0; j < n- i - 1; j++) {
				if (lista[j] > lista[j + 1]) {
					int temp = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = temp;
					trocou = true;
				}
			}
			if (!trocou) {
				break;
			}
		}
	}
}
