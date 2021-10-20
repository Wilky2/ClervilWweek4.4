package core.model.channelList;

public class Cell {
	
	Object element;
	Cell next;
	
	public Cell(Object element) {
		next = null;
		this.element = element;
	}
	
	public Cell(Object element,Cell next) {
		this.next = next;
		this.element = element;
	}

	public Object getElement() {
		return element;
	}

	public void setElement(Object element) {
		this.element = element;
	}

	public Cell getNext() {
		return next;
	}

	public void setNext(Cell next) {
		this.next = next;
	}
}
