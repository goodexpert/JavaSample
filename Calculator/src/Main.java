
public class Main {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		// 12 * 2 = ?
		c.number1();
		c.number2();
		c.multi();
		c.number2();
		c.assign();

		System.out.println("expected: 24, actual: " + c.displayNumber());
	}
}
