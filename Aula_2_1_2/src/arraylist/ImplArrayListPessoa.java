package arraylist;

import java.util.ArrayList;

public class ImplArrayListPessoa { // implementa uma lista ou coleção de uma classe
	public static void main(String[] args) {
		ArrayList<Pessoa> lista = new ArrayList<Pessoa>(10);
		
		lista.add(new Pessoa("Diogo"  , 23));
		lista.add(new Pessoa("Igor"   , 30));
		lista.add(new Pessoa("Núbia"  , 34));
		lista.add(new Pessoa("Adriano", 23));

		for (Pessoa pessoa : lista) {
			//System.out.println(pessoa.toString());
			System.out.println(pessoa);
		}
	}
}
