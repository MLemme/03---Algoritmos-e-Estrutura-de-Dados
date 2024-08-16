package pratica;

//import java.util.Scanner;
import java.util.Arrays;

public class Principal {
	public static void imprimirLista(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.print("[" + i + "]" + lista[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		/* 2.5.1
		Fila fila = new Fila();
		fila.inserir("Diogo");
		fila.inserir("Alexandre");
		fila.inserir("André");
		fila.inserir("Igor");
		System.out.println("Elemento Atendido: " + fila.atender());
		System.out.println("Pessoa na Fila: ");
		fila.listar();
		*/
		/* 2.5.1
		 * Fila fila = new Fila();
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("Digite: I - Inserir, A - Atender, L - Listar Fila e Qualquer  - Sair");
			String op = in.nextLine();
			if (op.equals("I")) {
				System.out.println("Digite o Nome da Pessoa:");
				String nome = in.nextLine();
				fila.inserir(nome);
			}else if(op.equals("A")) {
				System.out.println("Próximo da Fila: " + fila.atender());
			}else if(op.equals("L")) {
				fila.listar();
			}else {
				break;
			}
		}
		*/
		/* 2.5.2
		int lista[] = { 8, 2 , 5, 10, 300};
		System.out.println("Bubble Sort Crescente");
		BubbleSort.bubbleSortCrescente(lista);
		for (int elemento : lista)
			System.out.print(elemento + " ");
		System.out.println();
		System.out.println("Bubble Sort Decrescente");
		BubbleSort.bubbleSortDecrescente(lista);
		for (int elemento : lista)
			System.out.print(elemento + " ");
		System.out.println();
		System.out.println("Insertion Sort Crescente");
		Insertion.insertionSortCrescente(lista);
		for (int i = 0; i < lista.length; i++)
			System.out.print(lista[i] + " ");
		System.out.println();
		System.out.println("Insertion Sort Decrescente");
		Insertion.insertionSortDecrescente(lista);
		for (int i = 0; i < lista.length; i++)
			System.out.print(lista[i] + " ");
		System.out.println();
		System.out.println("Selection Sort Crescente");
		Selection.selectionSortCrescente(lista);
		int i = 0;
		while (i < lista.length) {
			System.out.print(lista[i] + " ");
			i++;
		}
		i = 0;
		System.out.println();
		System.out.println("Selection Sort Decrescente");
		Selection.selectionSortDecrescente(lista);
		while (i < lista.length) {
			System.out.print(lista[i] + " ");
			i++;
		}
		 */
		/* 2.5.3 */
		System.out.println("Recursivo");
		int[] lista = {1000,10,21,50,22,23,80,45,54,67,2,3,4,79,84,91,8,105,113,125,131,141};
		Arrays.sort(lista); //ordena a lista
		imprimirLista(lista);
		System.out.println(BuscaBinaria.preparabuscaBinaria(lista,91));
		System.out.println(BuscaBinaria.preparabuscaBinaria(lista,125));
		System.out.println();
		System.out.println("Iterativo");
		int[] lista_ = {11,12,22,25,34,64,90};
		int valorProcurado = 22;
		imprimirLista(lista_);
		int resultado = BuscaBinaria.buscaBinaria_(lista_, valorProcurado);
		if (resultado == -1) {
			System.out.println("Valor não encontrado na lista.");
		}else {
			System.out.println("Valor " + valorProcurado + " encontrado na posição " + resultado + ".");
		}
		
	}
	
}
