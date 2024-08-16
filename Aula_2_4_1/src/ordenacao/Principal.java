package ordenacao;

public class Principal {
	public static void main(String[] args) {
		int[] lista = new int[10];
		System.out.println("Bubble Sort");
		lista[0] = 10;
		lista[1] = 2;
		lista[2] = 7;
		lista[3] = 3;
		lista[4] = 8;
		lista[5] = 9;
		lista[6] = 5;
		lista[7] = 1;
		lista[8] = 3;
		lista[9] = 2;
		BubbleSort.imprimirLista(lista);
		BubbleSort.bubbleSortCrescente(lista);
		BubbleSort.imprimirLista(lista);
		System.out.println("Selection Sort");
		lista[0] = 10;
		lista[1] = 4;
		lista[2] = 7;
		lista[3] = 3;
		lista[4] = 8;
		lista[5] = 9;
		lista[6] = 5;
		lista[7] = 1;
		lista[8] = 6;
		lista[9] = 2;
		Selection.imprimirLista(lista);
		Selection.selectionSort(lista);
		Selection.imprimirLista(lista);
	}
}
