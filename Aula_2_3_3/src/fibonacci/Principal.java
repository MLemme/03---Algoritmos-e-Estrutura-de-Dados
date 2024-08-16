package fibonacci;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Valor:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		/*
		int resultado = FibonacciRecursivo_1.fib(n);
		System.out.println("Fibonacci 1: " + n + " é: " + resultado);
		resultado = FibonacciRecursivo_2.fib(n);
		System.out.println("Fibonacci 2: " + n + " é: " + resultado);
		*/
		in.close();
		for (int i = 1; i <= n; i++) {
			System.out.println("Fibonacci 1 (" + i + ") = " + FibonacciRecursivo_1.fib(i));
			System.out.println("Fibonacci 2 (" + i + ") = " + FibonacciRecursivo_2.fib(i));
			System.out.println("Fibonacci 3 (" + i + ") = " + FibonacciIterativo.fib(i));
		}
	}
}
