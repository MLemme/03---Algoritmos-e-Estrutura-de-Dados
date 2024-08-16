package fila;

//import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) { //Implementação de uma Fila com prioridade
		//Fila Comum
		Queue<String> filaComum = new LinkedList<>();

		filaComum.add("Igor");
		filaComum.add("Diogo");
		filaComum.add("André");
		
		System.out.println("Fila Comum ");
		while (!filaComum.isEmpty()) {
			System.out.println(filaComum.poll());
		}
		
		//Fila prioridade
		PriorityQueue<Pessoa> filaPrioridade = new PriorityQueue<>();
		filaPrioridade.add(new Pessoa("Carlos" , false));
		filaPrioridade.add(new Pessoa("Ana"    , true )); //Ana tem prioridade
		filaPrioridade.add(new Pessoa("Roberto", false));
		
		System.out.println("\nFila de Prioridade ");
		while (!filaPrioridade.isEmpty()) {
			System.out.println(filaPrioridade.poll().getNome());
		}
	}
}