package recursivo;

import java.util.Scanner;

public class FatorialRecursivo {
	public static void main(String[] args) {
		System.out.println("Valor:");
		Scanner in = new Scanner(System.in);
		int numero = in.nextInt();
		int resultado = fatorial(numero);
		System.out.println("Fatorial de " + numero + " é: " + resultado);
		in.close();
	}
	public static int fatorial(int n) {
		System.out.println(n);
		if (n == 0) {
			return 1; //Caso base
		}else {
			return n * fatorial(n-1); //Chamada recursiva
		}
	}
}
