
public class Fibonacci {
	public static void main(String[] args) {
		for (int i = 0; i < 80; i++)
			System.out.format("fibonacci(%d) = %d\n", i, fibonacci2(i));
	}

	// 재귀 호출 이란?
	// 재귀 호출 함수 작성시 주의할 점은?
	public static long fibonacci(int n) throws IndexOutOfBoundsException {
		if (n < 0)
			throw new IndexOutOfBoundsException(String.format("Out of bounds : %d", n));

		if (n == 0 || n == 1)
			return 1L;
		return fibonacci(n - 2) + fibonacci(n - 1);
		
	/*
		switch (n) {
			case 0:
			case 1:
				return 1;
			default:
				return fibonacci(n - 2) + fibonacci(n - 1);
		}
	 */
	}

	// Memorization 기법
	public static long fibonacci2(int n) {
		if (n < 0 || n > 80)
			throw new IndexOutOfBoundsException(String.format("Out of bounds : %d", n));

		if (n == 0 || n == 1)
			return 1L;

		long[] array = new long[n];
		array[0] = 1;
		array[1] = 1;
		for (int i = 2; i < n; i++) {
			array[i] = array[i - 2] + array[i - 1];
		}
		return array[n - 2] + array[n - 1];
	}

	public static boolean isAllowed(int height, int age) {
		return height >= 170 || age >= 20;
	}
}
