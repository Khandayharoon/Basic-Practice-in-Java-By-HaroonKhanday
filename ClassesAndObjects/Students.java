package ClassesAndObjects;

public class Students {

	String name;
	String fatherName;
	int id ;
	private int NIA;
	
	
	public int getNIA() {
		return NIA;
	}
	public void setNIA(int num) {
		if(num <=0) {
			return;
		}
		NIA = num;
	}
	
	
}
