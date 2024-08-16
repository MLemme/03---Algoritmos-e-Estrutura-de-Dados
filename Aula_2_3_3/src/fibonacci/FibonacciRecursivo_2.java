package fibonacci;

public class FibonacciRecursivo_2 {
	public static int fib(int n) {
		if (n != 1 && n != 2) {
			return fib(n - 1) + fib(n - 2);
		}else {
			return  1;
		}
	}
}
