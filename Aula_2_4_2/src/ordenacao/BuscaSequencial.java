package ordenacao;

public class BuscaSequencial {
	public static void main(String[] args) {
		int[] lista = {64, 34, 25, 12, 22, 11, 90};
		int valorProcurado = 22;
		int resultado = buscaSequencial(lista, valorProcurado);
		
		if (resultado == -1) {
			System.out.println("Valor não encontrado na lista.");
		}else {
			System.out.println("Valor " + valorProcurado + " encontrado na posição " + resultado + "." );
		}
	}
	public static int buscaSequencial(int[] lista, int valorProcurado) {
		//Loop que percorre cada elemento da lista
		for (int i = 0; i < lista.length; i++ ) {
			//Se o elemento atual for igual ao valor procurado, retorna a posição
			if (lista[i] == valorProcurado) {
				return i;
			}
		}
		//Se o loop terminar e o valor não for encontrado, retorna -1
		return -1;
	}
}
