package by.academy.classwork.lesson11;

public class Generics1<T, V, K> {

	private T val1;
	private V val2;
	private K val3;

	public Generics1(T val1, V val2, K val3) {
		this.val1 = val1;
		this.val2 = val2;
		this.val3 = val3;
	}

	public T getVal1() {
		return val1;
	}

	public void setVal1(T val1) {
		this.val1 = val1;
	}

	public V getVal2() {
		return val2;
	}

	public void setVal2(V val2) {
		this.val2 = val2;
	}

	public K getVal3() {
		return val3;
	}

	public void setVal3(K val3) {
		this.val3 = val3;
	}




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Generics1 [val1=");
		builder.append(val1);
		builder.append(", val2=");
		builder.append(val2);
		builder.append(", val3=");
		builder.append(val3);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((val1 == null) ? 0 : val1.hashCode());
		result = prime * result + ((val2 == null) ? 0 : val2.hashCode());
		result = prime * result + ((val3 == null) ? 0 : val3.hashCode());
		return result;
	}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Generics1 other = (Generics1) obj;
	if (val1 == null) {
		if (other.val1 != null)
			return false;
	} else if (!val1.equals(other.val1))
		return false;
	if (val2 == null) {
		if (other.val2 != null)
			return false;
	} else if (!val2.equals(other.val2))
		return false;
	if (val3 == null) {
		if (other.val3 != null)
			return false;
	} else if (!val3.equals(other.val3))
		return false;
	return true;
}
}
