
public class SingleLinkedList implements List {
	class Node {
		private int data;
		private Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;

	public SingleLinkedList() {
		// TODO Auto-generated constructor stub
		this.head = null;
		this.tail = null;
	}

	@Override
	public void addHead(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data, this.head);
		if (this.head == null)
			this.tail = newNode;

		this.head = newNode;
	}

	@Override
	public void addTail(int data) {
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
	public void insertAt(int index, int data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAt(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

}
