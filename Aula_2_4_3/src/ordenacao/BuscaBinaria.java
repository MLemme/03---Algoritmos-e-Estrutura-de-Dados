package ordenacao;

public class BuscaBinaria {
	public static void main(String[] args) {
		int[] lista = {11, 12, 22, 25, 34, 64, 90}; //Note que a lista está ordenada
		int valorProcurado = 22;
		
		int resultado = buscaBinaria(lista, valorProcurado);
		
		if (resultado == -1) {
			System.out.println("Valor não encontrado na lista.");
		}else {
			System.out.println("Valor " + valorProcurado + " encontrado na posição " + resultado + "." );
		}
	}
	public static int buscaBinaria(int[] lista, int valorProcurado) {
			int esquerda = 0;
			int direita = lista.length - 1;
			while (esquerda <= direita) {
				int meio = (esquerda + direita)/2;
				if (lista[meio] == valorProcurado) {
					return meio; //Valor Encontrado
				}else if(lista[meio] < valorProcurado){
					esquerda = meio + 1; //Procura na metade direita
				}else {
					direita = meio - 1; //Procura na metade esquerda
				}
			}
			return -1; //Valor não encontrado
	}
}
