package ClassesAndObjects;

public class DynamicArray {

	private int data[];
	private int nextElementIndex;

	public DynamicArray() {
		data = new int[5];
		nextElementIndex = 0;
	}

	public int size() {
		return nextElementIndex;
	}

	public boolean isEmpty() {

		return this.nextElementIndex == 0;
	}

	public void add(int element) {

		if (nextElementIndex == data.length) {
			doubleCapcity();
		}
		this.data[nextElementIndex] = element;
		nextElementIndex++;
	}

	private void doubleCapcity() {
		int temp[] = data;
		data = new int[2 * temp.length];
		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
	}

	public int get(int index) {
		if (index >= nextElementIndex) {
			// throw error
			return -1;
		}
		return data[index];
	}

	public void set(int index, int element) {
		if (index >= nextElementIndex) {
			// throw error
			return;
		}
		data[index] = element;
	}

	public void print() {
		if (nextElementIndex == 0) {
			System.out.println(-1);
		}
		for (int i = 0; i < nextElementIndex; i++) {
			System.out.print(data[i] + " ");
		}
	}

	public int removeLast() {
		if (nextElementIndex == 0) {
			// throw error 
			return -1;
		}
		int temp = data[nextElementIndex - 1];
//		data[nextElementIndex - 1] = 0;
		this.nextElementIndex = nextElementIndex - 1;

		return temp;
	}
}
