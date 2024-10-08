package pratica;

public class Insertion {
	public static void insertionSortCrescente(int[] lista) {
		int i, j, chave;
		for (i = 1; i < lista.length; i++) {
			chave = lista[i];
			for (j = i - 1; (j >= 0) && (lista[j] > chave); j--){
				lista[j + 1] = lista[j];
			}
			lista[j + 1] = chave;
		}
	}
	public static void insertionSortDecrescente(int[] lista) {
		int i, j, chave;
		for (i = 1; i < lista.length; i++) {
			chave = lista[i];
			for (j = i - 1; (j >= 0) && (lista[j] < chave); j--){
				lista[j + 1] = lista[j];
			}
			lista[j + 1] = chave;
		}
	}
}
