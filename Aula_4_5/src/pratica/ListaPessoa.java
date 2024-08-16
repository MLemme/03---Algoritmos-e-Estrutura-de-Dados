package pratica;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListaPessoa {
	public static void main(String[] args) {
		List<Pessoa> lPessoa = new LinkedList<Pessoa>();
		lPessoa.add(new Pessoa("Ana", 20));
		lPessoa.add(new Pessoa("Stella", 52));
		lPessoa.add(new Pessoa("Nubia", 31));
		lPessoa.add(new Pessoa("Elaine", 13));
		lPessoa.add(new Pessoa("Liz", 25));
		Collections.sort(lPessoa);
		for (Pessoa pessoa : lPessoa) {
			System.out.println(pessoa.getNome());
		}
	}
}
