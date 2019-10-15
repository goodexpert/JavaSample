
public class GenericLinkedList<T extends Object> implements GenericList<T> {
	class Node {
		private T data;
		private Node next;

		public Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;

	public GenericLinkedList() {
		// TODO Auto-generated constructor stub
		this.head = null;
		this.tail = null;
	}

	@Override
	public void addHead(T data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data, this.head);
		if (this.head == null)
			this.tail = newNode;

		this.head = newNode;
	}

	@Override
	public void addTail(T data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data, null);
		if (this.head == null)
			this.head = newNode;
		else {
			this.tail.next = newNode;
		}
		this.tail = newNode;
	}

	@Override
	public void removeHead() {
		// TODO Auto-generated method stub
		if (this.head == null)
			return;

		this.head = this.head.next;
		if (this.head == null)
			this.tail = null;
	}

	@Override
	public void removeTail() {
		// TODO Auto-generated method stub
		if (this.head == null)
			return;

		Node prev = this.head;
		while (prev.next != this.tail)
			prev = prev.next;

		prev.next = null;
		this.tail = prev;
	}

	@Override
	public void insertAt(int index, T data) {
		// TODO Auto-generated method stub
		int count = size();
		if (index < 0 || index > count) {
			throw new IndexOutOfBoundsException();
		}

		Node next = this.head;
		Node prev = null;
		while (index > 0) {
			prev = next;
			next = prev.next;
			index--;
		}
		
		// if prev is null and next is null, list is empty
		// if prev is null and next is not null, add a new node to head.

		// if prev is not null and next is null, add a new node as tail
		// if prev is not null and next is not null

		Node newNode = new Node(data, next);
		if (prev == null) {
			// if count is 0,
			if (next == null) {
				this.tail = newNode;
			}
			this.head = newNode;
		} else {
			prev.next = newNode;
			if (next == null) {
				this.tail = newNode;
			}
		}
	}

	@Override
	public void removeAt(int index) {
		// TODO Auto-generated method stub
		int count = size();
		if (count == 0 || index < 0 || index >= count) {
			throw new IndexOutOfBoundsException();
		}

		Node next = this.head;
		Node prev = null;
		while (index > 0) {
			prev = next;
			next = prev.next;
			index--;
		}

		if (prev == null) {
			if (next.next == null) {
				this.tail = null;
			}
			this.head = next.next;
		} else {
			if (next.next == null) {
				this.tail = prev;
			}
			prev.next = next.next;
		}
	}

	@Override
	public T getAt(int index) {
		// TODO Auto-generated method stub
		int count = size();
		if (count == 0 || index < 0 || index >= count) {
			throw new IndexOutOfBoundsException();
		}

		Node next = this.head;
		while (index > 0) {
			next = next.next;
			index--;
		}
		return next.data;
	}

	@Override
	public int size() {
		int count = 0;
		Node next = this.head;

		while (next != null) {
			next = next.next;
			count++;
		}
		return count;
	}

}
