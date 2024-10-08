package pratica;

public class Pessoa implements Comparable<Pessoa>{
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int compareTo(Pessoa outraPessoa) {
		if (this.idade > outraPessoa.getIdade())
			return 1;
		if (this.idade < outraPessoa.getIdade())
			return -1;
		else
			return 0;
	}
}
