package Inheritance;

public class hraandpf extends Salary {
	double hr;
	double pf;
	public void displayhr()
	{
	  hr = 0.05* basicpay;
	System.out.println("hr= " + hr);
	}
	
	public void displaypf()
	{
		 pf = 0.2* basicpay;
		System.out.println("pf= "+ pf);
	}

}
