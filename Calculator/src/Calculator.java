import java.util.*;

enum KeyPad {
	KEYPAD_0('0'),
	KEYPAD_1('1'),
	KEYPAD_2('2'),
	KEYPAD_3('3'),
	KEYPAD_4('4'),
	KEYPAD_5('5'),
	KEYPAD_6('6'),
	KEYPAD_7('7'),
	KEYPAD_8('8'),
	KEYPAD_9('9'),

	KEYPAD_DOT('.'),

	KEYPAD_PLUS('+'),
	KEYPAD_MINUS('-'),
	KEYPAD_MULTI('*'),
	KEYPAD_DIVIDE('/'),
	KEYPAD_ASSIGN('='),

	KEYPAD_CLR('C');

	private char value;

	private KeyPad(char value) {
		this.value = value;
	}

	public char value() {
		return value;
	}
}

enum InputMode {
	Digit, Operator
}

public class Calculator {
	private int number = 0;
	private int exp = -1;
	
	private Integer rightNumber = null;
	private KeyPad lastOp = null;
	private InputMode lastInput = InputMode.Digit;

	List<Integer> operands = new ArrayList<Integer>();
	List<Character> operators = new ArrayList<Character>();

	private int number() {
//		double number = this.number;
//		if (exp >= 0) {
//			number /= Math.pow(10, exp);
//		}
		return this.number;
	}

	public String displayNumber() {
//		double displayNumber = number;
//		String format = "%.f";
//		if (exp >= 0) {
//			displayNumber /= Math.pow(10, exp);
//			format = String.format("%%.%df", exp);
//		}
//		return String.format(format, displayNumber);
		return "" + this.number;
	}

	private void number(KeyPad key) {
		int digit = key.value() - '0';
		
		/* 마지막 입력이 연산자 였다면 */
		if (lastInput == InputMode.Operator) {
			number = digit;
		} else {
			number = number * 10 + digit;
			if (exp >= 0) {
				exp++;
			}
		}
		lastInput = InputMode.Digit;
	}

	private int processCalc(int left, int right, char operator) {
		if (operator == '+') {
			return (left + right);
		} else if (operator == '-') {
			return (left - right);
		} else if (operator == '*') {
			return (left * right);
		} else if (operator == '/') {
			return (left / right);
		}
		return 0;
	}

	private void operator(KeyPad op) {
		// 이전 입력상태가 Digit라면
		if (lastInput == InputMode.Digit) {
			// 연산자 입력전에 편집중이던 숫자를 스택에 저장한다.
			this.operands.add(0, number());
		}

		int numbers = operands.size();
		if (numbers == 2) {
			this.rightNumber = this.operands.remove(0);
			int leftNumber = this.operands.remove(0);
			Character operator = this.operators.remove(0);
			// 결과를 화면에 출력하고, 스택에 저장.
			this.operands.add(0, processCalc(leftNumber, rightNumber, operator));
		} else if (numbers == 1) {
			if (this.operators.size() == 0) {
				if (op == KeyPad.KEYPAD_ASSIGN && this.lastOp != null) {
					int leftNumber = this.operands.remove(0);
					Character operator = this.lastOp.value();
					this.operands.add(0, processCalc(leftNumber, rightNumber, operator));
				} else if (op != KeyPad.KEYPAD_ASSIGN) {
					this.operators.add(0, op.value());
				}
			} else if (this.lastOp != null && op == KeyPad.KEYPAD_ASSIGN) {
				int leftNumber = this.operands.remove(0);
				Character operator = this.operators.remove(0);
				this.operands.add(0, processCalc(leftNumber, rightNumber, operator));
			}
		}
	}

	public void number0() {
		number(KeyPad.KEYPAD_0);
	}

	public void number1() {
		number(KeyPad.KEYPAD_1);
	}

	public void number2() {
		number(KeyPad.KEYPAD_2);
	}

	public void number3() {
		number(KeyPad.KEYPAD_3);
	}

	public void number4() {
		number(KeyPad.KEYPAD_4);
	}

	public void number5() {
		number(KeyPad.KEYPAD_5);
	}

	public void number6() {
		number(KeyPad.KEYPAD_6);
	}

	public void number7() {
		number(KeyPad.KEYPAD_7);
	}

	public void number8() {
		number(KeyPad.KEYPAD_8);
	}

	public void number9() {
		number(KeyPad.KEYPAD_9);
	}

	public void dot() {
		if (lastInput == InputMode.Operator || exp < 0) {
			if (lastInput == InputMode.Operator)
				number = 0;
			exp = 0;
		}
		lastInput = InputMode.Digit;
	}

	public void plus() {
		operator(KeyPad.KEYPAD_PLUS);
	}

	public void minus() {
		operator(KeyPad.KEYPAD_MINUS);
	}

	public void divide() {
		operator(KeyPad.KEYPAD_DIVIDE);
	}

	public void multi() {
		operator(KeyPad.KEYPAD_MULTI);
	}

	public void assign() {
		operator(KeyPad.KEYPAD_ASSIGN);
	}
}
