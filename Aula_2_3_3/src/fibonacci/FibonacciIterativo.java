package fibonacci;

public class FibonacciIterativo {
	public static int fib(int n) {
		int i = 1;
		int j = 0;
		int t;
		for (int k = 1; k <= n; k++) {
			t = i + j;
			i = j;
			j = t;
		}
		return j;
	}
}
