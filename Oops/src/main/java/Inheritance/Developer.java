package Inheritance;

public class Developer extends Employee {
	public void display1()
	{
		System.out.println("Developer details");
	}
public static void main(String[] args) {
	Developer obj = new Developer();
	obj.display();
	obj.display1();
}
}
