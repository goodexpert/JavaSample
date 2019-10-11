
public class GenericArrayStack <T extends Object> implements GenericStack<T> {
	// class's members
	private static final int DEFAULT_SIZE = 10;

	// instance's members
	private final Object[] stack;
	private int size;
	private int topIndex;

	// Default constructor
	// 클래스의 멤버를 초기화 한다.
	public GenericArrayStack() {
		this.size = DEFAULT_SIZE;
		this.stack = new Object[this.size];
		this.topIndex = 0;
	}

	public GenericArrayStack(int size) {
		this.size = size;
		this.stack = new Object[size];
		this.topIndex = 0;
	}

	public synchronized void push(T data) {
		if (isFull())
			return;

		this.stack[this.topIndex] = data;
		this.topIndex++;
	}

	public synchronized void pop() {
		if (isEmpty())
			return;

		this.stack[this.topIndex - 1] = null;
		this.topIndex--;
	}

	public synchronized T top() {
		return isEmpty() ? null : (T) this.stack[this.topIndex - 1];
	}

	public boolean isEmpty() {
		return this.topIndex == 0;
	}

	public boolean isFull() {
		return this.topIndex == this.size;
	}
}
