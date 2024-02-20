package ClassesAndObjects;

public class DynamicArrayuse {

	public static void main(String[] args) {

		DynamicArray d = new DynamicArray();

		System.out.println(d.size());
		System.out.println(d.isEmpty());
		for (int i = 0; i <7; i++) {
			d.add((11 + i));
		}
		System.out.println(d.size());
		System.out.println(d.isEmpty());
		System.out.println(d.get(5));
		System.out.println();
		d.set(5, 99);
		d.print();

		while (!d.isEmpty()) {
			System.out.println(d.removeLast());
			System.out.println("Size :-  " + d.size());
		}
		
		System.out.println(d.size());
		System.out.println(d.isEmpty());
		d.print();
		System.out.println();
		d.addAnywhere(4, 786);
		d.print();
	}

}
