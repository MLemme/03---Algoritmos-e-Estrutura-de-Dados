package iterativo;

import java.util.Scanner;

public class FatorialIterativo {
	public static void main(String[] args) {
		System.out.println("Valor:");
		Scanner in = new Scanner(System.in);
		int numero = in.nextInt();
		int resultado = fatorial(numero);
		System.out.println("Fatorial de " + numero + " é: " + resultado);
		in.close();
	}
	public static int fatorial(int n) {
		int resultado = 1;
		for (int i = 1; i <= n; i++) {
			resultado *= i;
		}
		return resultado;
	}
}
