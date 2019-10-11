//import java.util.Collection;
//import java.util.ArrayList;
import java.util.*;

//public class ArrayStack extends AbstractStack {
public class ListStack implements IStack {
	// class's members
	private static final int DEFAULT_SIZE = 10;

	// instance's members
	private List<Object> stack;
	private int size;
	private int topIndex;

	// Default constructor
	// 클래스의 멤버를 초기화 한다.
	public ListStack() {
		this.size = DEFAULT_SIZE;
		this.stack = new ArrayList<Object>(DEFAULT_SIZE);
		this.topIndex = 0;
	}

	public ListStack(int size) {
		this.size = size;
		this.stack = new ArrayList<Object>(size);
		this.topIndex = 0;
	}

	public synchronized void push(Object data) {
		if (isFull())
			return;

		this.stack.add(this.topIndex, data);
		this.topIndex++;
	}

	public synchronized void pop() {
		if (isEmpty())
			return;

		this.stack.remove(this.topIndex - 1);
		this.topIndex--;
	}

	public synchronized Object top() {
		return isEmpty() ? null : this.stack.get(this.topIndex - 1);
	}

	public boolean isEmpty() {
		return this.topIndex == 0;
	}

	public boolean isFull() {
		return this.topIndex == this.size;
	}
}
