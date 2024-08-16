package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ImplArrayList { //Coleção no Java, lista dinâmica
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>(10);
		
		lista.add("Diogo");
		lista.add("Igor");
		lista.add("Núbia");
		lista.add("Adriano");
		lista.add("Stella");
		lista.add("Iolanda");
		lista.add("Miguel");
		lista.add("André");
		lista.add("Elaine");
		lista.add("Pellon");
		lista.add("Thiago");
		
		Iterator it = lista.iterator();
		
		while (it.hasNext()) {
			String aux = (String) it.next();
			System.out.println(aux);
		}
	}
}
