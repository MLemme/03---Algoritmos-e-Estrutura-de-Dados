package exemplo;

//import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) {
		/*
		//Aula 5.1 - Analise de complexidade por acesso de uma lista
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o nome que deseja encontrar: ");
		String nome = in.nextLine();
		Lista l = new Lista();
		System.out.println(l.buscar(nome) ? "Achou" : "Não Achou");
		in.close();
		*/
		//Aula 5.3.1 - Tratamento de erros
		/*
		try {
			Scanner in = new Scanner(System.in);
			int n1 = in.nextInt();
			int n2 = in.nextInt();
			int res = n1 / n2; 
			System.out.println(res);
			in.close();
		}
		catch (Exception e) {
			System.err.println("Exceção");
			e.printStackTrace();
		}
		finally {
			System.out.println("Irá Rodar");
		}
		*/
		//Aula 5.3.2 - Leitura de arquivo e escrita
		FileWriter fw;
		try {
			System.err.println("Início");
			fw = new FileWriter("../teste_log.txt"); 
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Faculdade");
			bw.newLine();
			bw.close();
			fw.close();
		}
		catch (IOException e) {
			System.err.println("Exceção");
			e.printStackTrace();
		}
		finally {
		}
	}
}