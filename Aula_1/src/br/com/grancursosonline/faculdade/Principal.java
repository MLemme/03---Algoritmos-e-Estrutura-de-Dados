package br.com.grancursosonline.faculdade;

// import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//Aula 1.2
		/*String nome = "Mauricio";*/
		/*System.out.println("Algoritmos e Estrutura de Dados " + nome);*/
		
		//Aula 1.3
		//int a, b, resposta; Tipos primitivos
		/*Integer a, b, resposta; //Tipos de referência
		
		String nome = "";
		//double percentual; Tipo primitivo
		Double percentual; //Tipo de referência
		
		Scanner in = new Scanner(System.in);  
		System.out.println("Digite o primeiro número: ");
		a = in.nextInt();
		System.out.println("Digite o segundo número: ");
		b = in.nextInt();
		System.out.println("Digite o seu nome: ");
		nome = in.next();
		System.out.println("Digite um número percentual:  ");
		percentual = in.nextDouble();
		resposta = a + b;
		
		System.out.println("A soma dos dois números é: " + resposta);
		System.out.println("Quem escreveu foi: " + nome);
		System.out.println(percentual);
		*/
		//Aula 2.3
		Aluno aluno = new Aluno("Mauricio",39,"1234");
		aluno.estudar(); //Aula 2.4
		aluno.estudar("Java");
		aluno.estudar("Java", "Mauricio");
		System.out.println(aluno.getInfo());//Aula 2.5
		System.out.println(aluno.nome);
	}
}
