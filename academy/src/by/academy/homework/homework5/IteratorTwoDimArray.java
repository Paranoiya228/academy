package by.academy.homework.homework5;

import java.util.Iterator;

public class IteratorTwoDimArray<T> implements Iterator<T> {

	private T[][] array;
	private int curLine, curColumn;

	public IteratorTwoDimArray() {
		super();
	}

	public IteratorTwoDimArray(T[][] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		if (array == null || array.length <= curLine) {
			return false;
		}
		return array[curLine][curColumn] != null;

	}

	@Override
	public T next() {
		T arr = array[curLine][curColumn++];
		
		if (curColumn >= array[curLine].length) {
			
			curLine++;
			curColumn = 0;
		}
		return arr;

	}

}
