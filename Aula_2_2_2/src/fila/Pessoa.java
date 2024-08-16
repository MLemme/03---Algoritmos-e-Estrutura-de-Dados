package fila;

public class Pessoa implements Comparable<Pessoa>{ //Necessário para usar PriorityQueue
	private String nome;
	private boolean prioridade;
	public Pessoa(String nome, boolean prioridade) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.prioridade = prioridade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean getPrioridade() {
		return prioridade;
	}
	public void setIdade(boolean prioridade) {
		this.prioridade = prioridade;
	}
	public String toString() {
		return "Pessoa [nome=" + nome + ", prioridade=" + prioridade + "]";
	}
	@Override //Necessário para utilizar PriorityQueue
	public int compareTo(Pessoa outraPessoa) {
		if (this.prioridade && !outraPessoa.prioridade) {
			return -1;
		}else if(!this.prioridade && outraPessoa.prioridade) {
			return 1;
		}
		return this.nome.compareToIgnoreCase(outraPessoa.nome);
	}
}
