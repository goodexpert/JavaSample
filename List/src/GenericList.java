
public interface GenericList<T extends Object> {

	void addHead(T data);
	void addTail(T data);

	void removeHead();
	void removeTail();

	void insertAt(int index, T data);
	void removeAt(int index);

	T getAt(int index);
	int size();
}
