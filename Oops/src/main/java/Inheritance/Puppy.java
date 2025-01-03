package Inheritance;

public class Puppy extends Dog {
	
	String puppy = " Jack";
	
	public void display2()
	{
		System.out.println("puppy name" + puppy);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy obj= new Puppy();
		obj.display();
		obj.display1();
		obj.display2();

	}

}

