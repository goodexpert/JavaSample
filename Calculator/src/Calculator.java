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
	String displayNumber = "";
	InputMode lastInput = InputMode.Digit;

	private void number(KeyPad key) {
		char digit = key.value();
		
		/* 마지막 입력이 연산자 였다면 */
		if (lastInput == InputMode.Operator) {
			displayNumber = "" + digit;
		} else {
			displayNumber += digit;
		}
		lastInput = InputMode.Digit;
	}

	public void operator(KeyPad op) {
		
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
}
