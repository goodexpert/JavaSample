import java.util.*;

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		
		for (int i = 0; i < 10; i++)
			stack.addLast(i); // list.add(new Integer(i));
		
		for (int i = 1; i <= 10; i++)
			System.out.format("%d: %d\n", 10 - i, stack.removeLast());

		/*
		ArrayStack stack = new ArrayStack(10);
		for (Integer i = 0; i < 10; i++)
			stack.push(i);

		for (Integer j = 0; j < 11; j++) {
			System.out.format("%s \n", stack.top().toString());
			stack.pop();
		}
		*/
	}
}
