package Inheritance;

public class Tester extends Employee {

	public void display3()
	{
		System.out.println("Tester details");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester obj = new Tester();
		obj.display();
		obj.display3();
		Developer obj1 = new Developer();
		obj1.display();
		obj1.display1();
	}

}
