package Inheritance;

public class Car extends Vehicle {
	
	int distance = 20;
	public void display()
	{
		System.out.println("Show the distance of car");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car obj = new Car();
		obj.distance();
		obj.display();
		System.out.println(obj.speed);
		System.out.println(obj.distance);

	}

}
