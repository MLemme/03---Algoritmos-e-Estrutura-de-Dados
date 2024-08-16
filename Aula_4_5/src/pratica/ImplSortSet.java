package pratica;

import java.util.Iterator;
import java.util.TreeSet;

public class ImplSortSet {
	public static void main(String[] args) {
		TreeSet<String> lista = new TreeSet<String>();
		lista.add("Diogo");
		lista.add("Vitória");
		lista.add("Beatriz");
		lista.add("Jeane");
		lista.add("Liz");
		lista.add("Ana");
		lista.add("Stella");
		Iterator<String> it = lista.iterator();
		while (it.hasNext()) {
			String aux = (String) it.next();
			System.out.println(aux);
		}
		
	}
}
