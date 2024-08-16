package pratica;

import java.util.Iterator;

public class Selection {
	public static void selectionSort(int lista[]) {
		int n = lista.length;
		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++) {
				if (lista[j] < lista[min_idx]) {
					min_idx = j;
				}
				
			}
			int temp = lista[min_idx];
			lista[min_idx] = lista[i];
			lista[i] = temp;
		}
	}
	public static void selectionSortCrescente(int[] lista) {
		int i, j, menor;
		for (i = 0; i < lista.length - 1; i++) {
			menor = i;
			for (j = menor + 1; j < lista.length; j++) {
				if (lista[j] < lista[menor]) {
					menor = j;
				}
			}
			if (menor != i) {
				int tmp = lista[i];
				lista[i] = lista[menor];
				lista[menor] = tmp;
			}
		}
	}
	public static void selectionSortDecrescente(int[] lista) {
		int i, j, maior;
		for (i = 0; i < lista.length - 1; i++) {
			maior = i;
			for (j = maior + 1; j < lista.length; j++) {
				if (lista[j] > lista[maior]) {
					maior = j;
				}
			}
			if (maior != i) {
				int tmp = lista[i];
				lista[i] = lista[maior];
				lista[maior] = tmp;
			}
		}
	}
}
