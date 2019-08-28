
public class FibMemoization {

	static int[] lookup;
	static int[] factlookup;

	public static void main(String[] args) {
		int n = 10;
		lookup = new int[n + 1];
		factlookup = new int[n + 1];

		for (int i = 0; i <= n; i++) {
			lookup[i] = -1;
			factlookup[i] = -1;
		}
		// fib(n);
		// System.out.println(fib(n-1));

		System.out.println(fact(5));
	}

	public static int fib(int n) {
		if (lookup[n] == -1) {
			if (n <= 1) {
				lookup[n] = n;
			} else {
				lookup[n] = fib(n - 1) + fib(n - 2);
			}
		}
		return lookup[n];
	}

	public static int fact(int n) {
		if (factlookup[n] == -1) {
			if (n <= 1) {
				factlookup[n] = 1;
			} else {
				factlookup[n] = n * fact(n - 1);
			}
		} 
		return factlookup[n];
	}

}
