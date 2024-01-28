package RenderedIdeas;

public class mainCharacter {

	public static void main(String[] args) {

		Character c1 = new Character();
		c1.id = 100;
		c1.name = "james";
		c1.postionX = 10;

		Character c2 = new Character();
		c2.id = 99;
		c2.postionY = c1.postionX;

		System.out.println(c1);
		System.out.println(c1.name);
		System.out.println(c1.postionY);
		System.out.println(c2.postionX);
	}

}
