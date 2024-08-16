package ordenacao;

public class Selection {
	//Método que implementa o algoritmo Selection Sort
	public static void selectionSort(int lista[]) {
		//Obtendo o tamanho da lista
		int n = lista.length;
		
		//Loop externo que percorre cada elemento da lista
		for (int i = 0; i < n - 1; i++) {
			//Assumindo que o elemento atual é o menor
			int min_idx = i;
			
			//Loop interno que compara o elemento atual com os próximos elementos
			for (int j = i + 1; j < n; j++) {
				//Se encontrarmos um elemento menor que o atual, atualizamos min_idx
				if (lista[j] < lista[min_idx]) {
					min_idx = j;
				}
				
			}
			
			//Após encontrar o menor elemento, trocamos sua posição com o lemento atual
			int temp = lista[min_idx];
			lista[min_idx] = lista[i];
			lista[i] = temp;
		}
	}
	public static void imprimirLista(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + " ");
		}
		System.out.println();
	}
}
