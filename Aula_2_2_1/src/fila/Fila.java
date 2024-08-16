package fila;

//import java.util.Iterator;
import java.util.LinkedList;

public class Fila {
	public static void main(String[] args) { //Implementação de uma Fila operando em FIFO
		LinkedList<String> fila = new LinkedList<String>();
		fila.add("Igor");
		fila.add("Diogo");
		fila.add("André");
		fila.add("Alexandre");
		
		int tam = fila.size();
		
		for (int i = 0; i < tam; i++) {
			System.out.println(i + " " + fila.getFirst());
			fila.removeFirst();
		}
	}
}