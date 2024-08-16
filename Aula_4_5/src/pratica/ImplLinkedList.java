package pratica;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ImplLinkedList {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<String> lista = new LinkedList<String>();
		String str = "";
		while (!str.equals("sair")) {
			str = in.nextLine();
			if (!str.equals("sair")) {
				lista.add(str);
			}
		}
		Collections.sort(lista);
		Iterator<String> i = lista.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
