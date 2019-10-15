import java.util.*;

public class AddressBook<T extends Address> {
	private List<T> list;

	public AddressBook() {
		this.list = new ArrayList<T>();
	}

	public void add(int index, T address) {
		this.list.add(index, address);
	}

	public void addFirst(T address) {
		add(0, address);
	}

	public void addLast(T address) {
		add(this.list.size(), address);
	}

	public void remove(int index) {
		this.list.remove(index);
	}

	public void remove(T address) {
		this.list.remove(address);
	}

	public void clear() {
		this.list.clear();
	}

	public void print() {
		for (Address address : this.list) {
			System.out.format("ÀÌ¸§ : %s %s\n",
					address.getLastName(), address.getFirstName());
		}
	}
}
