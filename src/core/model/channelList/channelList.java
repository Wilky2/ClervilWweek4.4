package core.model.channelList;

public class ChannelList {
	
	Cell head;
	int nbElement;

	public ChannelList(Cell head) {
		this.head = head;
	}

	public ChannelList() {
		head = null;
	}
	
	public Cell getHead() {
		return head;
	}

	public void addHead(Object element) {
		head = new Cell(element,head);
		nbElement++;
	}
	
	public void addTail(Object element) {
		if(head == null) {
			addHead(element);
		}
		else {
			Cell tail = head;
			
			while(tail.getNext()!=null) {
				tail = tail.getNext();
			}
			
			tail.setNext(new Cell(element,null));
			nbElement++;
		}
	}
	
	private Cell reverseRecursive(Cell h) {
		if(h==null) {
			return null;
		}
		if(h.getNext()==null) {
			return h;
		}
		Cell tail = reverseRecursive(h.getNext());
		Cell temp = h.getNext();
		temp.setNext(h);
		h.setNext(null);
		return tail;
	}
	
	public void reverse() {
		this.head = reverseRecursive(this.head);
	}
	
	public void clear() {
		head = null;
	}
	
	public String toString() {
		if(head == null) {
			return " ";
		}
		
		if(head.getNext()==null) {
			return "[ " + head.getElement() + " ]";
		}
		
		String s = "[ ";
		
		Cell temp = head;
		
		while(temp!=null) {
			s+=" ( "+temp.getElement() + " ) ";
			temp = temp.getNext();
		}
		s+= "]";
		return s;
	}
	
}
