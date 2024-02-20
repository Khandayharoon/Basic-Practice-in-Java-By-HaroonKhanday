package ClassesAndObjects;



public class Fraction {

	private int numirator;
	private int denominrator;
	
	public Fraction() {
	 }

	public Fraction(int numirator, int denominrator) {
		if (denominrator == 0) {
			this.denominrator = 1;
		}
		else {
			this.denominrator = denominrator;
		}
		this.numirator = numirator;
		
		simplfy();
	}

	public void simplfy() {
		int num = Math.min(numirator, denominrator);
		int gdc = 1;
		;
		for (int i = 1; i <= num; i++) {
			if (numirator % i == 0 && denominrator % i == 0) {
				gdc = i;
			}
		}

		numirator = numirator / gdc;
		denominrator = denominrator / gdc;
	}

	public void print() {
		System.out.println(numirator + "/" + denominrator);
	}

	public void setnum(int numirator) {
		this.numirator = numirator;

	}

	public int getnum() {
		return this.numirator;
	}

	public void setden(int denominrator) {
		if (denominrator == 0) {
			return;
		}
		this.denominrator = denominrator;
	}

	public int getden() {
		return this.denominrator;
	}
	
	public void add(Fraction f2) {
		this.numirator = this.numirator *f2.denominrator +this.denominrator*f2.numirator;
		this.denominrator = this.denominrator *f2.denominrator;
		simplfy();
	}
	
//	public static Fraction add(Fraction f1,Fraction f2) {
//		int newnum = f1.numirator*f2.denominrator+f2.numirator*f1.denominrator;
//		int newden = f1.denominrator*f2.denominrator;
//		Fraction f3 = new Fraction (newnum ,newden);
//		return f3;
//	}
	public Fraction add(Fraction f1,Fraction f2) {
		int newnum = f1.numirator*f2.denominrator+f2.numirator*f1.denominrator;
		int newden = f1.denominrator*f2.denominrator;
		return new Fraction (newnum ,newden);
		 
	}
}
