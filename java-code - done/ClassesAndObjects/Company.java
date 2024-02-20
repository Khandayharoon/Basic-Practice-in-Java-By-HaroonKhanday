package ClassesAndObjects;

public class Company {

	String name;
	int id;

	public int getid() {
		return this.id;

	}

	public void setid(int id) {
		if (id <= 0) {
			return;
		}
		this.id = id;
	}

	Company(String name, int id) {
		this.name = name;
		this.id = id;
	}

	Company(String name) {
		this.name = name;
		id = 11;
	}

	Company() {

	}

	public void print() {
		System.out.println("NAME:- " + name + "ID:- " + id);
	}

}
