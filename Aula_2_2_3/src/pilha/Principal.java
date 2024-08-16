package pilha;

import java.util.LinkedList;

public class Principal {
	//Implementação de uma pilha com inserção e demonstração da ordem de saída
	public static void main(String[] args) {  
		LinkedList<String> pilha = new LinkedList<String>();
		pilha.push("Milton");
		pilha.push("Igor");
		pilha.push("Diogo");
		pilha.push("Stella");
		int tam = pilha.size();
		for (int i = 0; i < tam; i++) {
			System.out.println(pilha.pop());
		}
	}
}