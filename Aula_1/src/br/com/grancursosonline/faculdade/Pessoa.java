package br.com.grancursosonline.faculdade;

public class Pessoa {//Aula 2.3
	public String nome;
	public int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade; //Aula 2.5
	}
	
	public void estudar() { //Aula 2.4
		System.out.println("Estudando");
	}
	public void estudar(String disciplina) {//Aula 2.4
		System.out.println("Estudando " + disciplina);
	}
	
	public void estudar(String disciplina , String nome) {//Aula 2.4
		System.out.println("Estudando " + disciplina + " " + nome);
	}
	
	public String getInfo() { //Aula 2.5 Sobrescrita
		return "Nome: " + nome + ", Idade: " + idade; 
	}
}