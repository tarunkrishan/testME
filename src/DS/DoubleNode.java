package DS;

public class DoubleNode<T> {

	private DoubleNode<T> prev;
	private DoubleNode<T> next;
	private T value;
	
	public DoubleNode(T val) {
		value = val;
	}

	public DoubleNode<T> getPrev() {
		return prev;
	}

	public void setPrev(DoubleNode<T> prev) {
		this.prev = prev;
	}

	public DoubleNode<T> getNext() {
		return next;
	}

	public void setNext(DoubleNode<T> next) {
		this.next = next;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
}
