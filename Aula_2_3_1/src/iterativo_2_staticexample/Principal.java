package iterativo_2_staticexample;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Valor:");
		Scanner in = new Scanner(System.in);
		int numero = in.nextInt();
		int resultado = FatorialIterativo.fatorial(numero); //static class utilizada sem instaciar um novo objeto
		System.out.println("Fatorial de " + numero + " é: " + resultado);
		in.close();
	}
}
