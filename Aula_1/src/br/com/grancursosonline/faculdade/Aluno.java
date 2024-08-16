package br.com.grancursosonline.faculdade;

public class Aluno extends Pessoa{//Aula 2.3
	private String matricula;
	public Aluno(String nome, int idade, String matricula){
		super(nome,idade);
		this.matricula = matricula;
	}
	//Aula 2.5
	@Override
	public String getInfo() {
		return	super.getInfo() + ", Matricula: " + matricula;
	}
}
