package pratica;

public class BuscaBinaria {
	// Método recursivo
	public static int preparabuscaBinaria(int[] lista, int elemento) {
		return buscaBinaria(lista, 0, lista.length - 1, elemento);
	}
	public static int buscaBinaria(int[] lista, int menor, int maior, int elemento) {
		int indexMetade = (maior + menor)/2;
		int elementoComp = lista[indexMetade];
		if (menor > maior) 
			return -1;
		else if (elementoComp == elemento)
			return indexMetade;
		else if(elementoComp < elemento)
			return buscaBinaria(lista, indexMetade + 1, maior, elemento);
		else
			return buscaBinaria(lista, menor, indexMetade - 1, elemento);
	}
	//Método iterativo
	public static int buscaBinaria_(int[] lista, int valorProcurado) {
		int esquerda = 0;
		int direita = lista.length - 1;
		while (esquerda <= direita) {
			int meio = (esquerda + direita) / 2;
			if (lista[meio] == valorProcurado) {
				return meio; //Valor encontrado
			} else if (lista[meio] < valorProcurado) {
				esquerda = meio + 1; //Procura na metade direita
			} else {
				direita = meio - 1; //Procura na metade esquerda
			}
		}
		return -1; //Valor não encontrado
	}
}
