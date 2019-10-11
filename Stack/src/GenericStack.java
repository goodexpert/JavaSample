// Generic
public interface GenericStack <T extends Object> {
	  void push(T data);
	  void pop();
	  T top();
	  
	  boolean isEmpty();
}
