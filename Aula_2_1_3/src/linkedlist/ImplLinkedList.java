package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class ImplLinkedList {
	public static void main(String[] args) {
		LinkedList<String> lista = new LinkedList<String>(); //Implementa uma lista encadeada
		lista.add("Igor");
		lista.add("Diogo");
		lista.add("André");
		lista.add("Alexandre");
		lista.add("Pellon");
		lista.add("Daniel");
		lista.add("Custódio");
		lista.add("Mirela");
		lista.add("Amanda");
		lista.add("Gabriel");
		lista.add("Iolanda");
		Iterator<String> i = lista.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
