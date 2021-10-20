package core.model.arrayList;

import java.util.Arrays;

public class ListArray<T>{

	private T[] array;
	int nbElement;
	
	public ListArray(ListArray<T> t) {
		this.array = Arrays.copyOf(t.array,t.array.length);
		this.nbElement = t.nbElement; 
	}
	
	public ListArray() {
		array =  (T[]) new Object[5];
		nbElement = 0;
	}

	public int size() {
		return nbElement;
	}
	
	public boolean isEmpty() {
		return nbElement == 0;
	}

	public boolean contains(Object o) {
		for(int i = 0;i<nbElement;i++) {
			if(array[i].equals(o)) {
				return true;
			}
		}
		return false;
	}
	
	private void newSize(int s) {
		T[] temp = Arrays.copyOf(this.array,this.array.length);
		this.array = (T[]) new Object[s];
		this.array = Arrays.copyOf(temp,temp.length);
	}
	
	public T get(int pos) {
		if(pos<nbElement) {
			return this.array[pos];
		}
		throw new IndexOutOfBoundsException();
	}
	
	public void add(Object o) {
		if(nbElement>array.length-1) {
			newSize(array.length+20);
		}
		if(nbElement>=array.length) {
			newSize(array.length+20);
		}
		this.array[nbElement] = (T) o;
		nbElement++;
	}
	
	public void add(int pos, Object o) {
		if(pos>nbElement) {
			throw new IndexOutOfBoundsException();
		}
		
		if(nbElement>=array.length) {
			newSize(array.length+20);
		}
		
		if(pos == nbElement) {
			add(o);
		}
		else{
			for(int i = nbElement; i>pos;i--) {
				this.array[i] = this.array[i-1];
			}
			this.array[pos] = (T) o;
			nbElement++;
		}
	}
	
	public void set(int pos, Object o) {
		if(pos>=nbElement) {
			throw new IndexOutOfBoundsException();
		}
		this.array[pos] = (T) o;
	}
	
	public void remove(int pos) {
		if(pos >= nbElement) {
			throw new IndexOutOfBoundsException();
		}
		
		for(int i = pos; i<nbElement-1;i++) {
			this.array[i] = this.array[i+1];
		}
		
		nbElement--;
	}
	
	public String toString() {
		String s = "[ ";
		
		for(int i = 0; i<nbElement;i++) {
			s+=" ( " + this.array[i] + " ) ";
		}
		s+="]";
		return s;
	}
}
