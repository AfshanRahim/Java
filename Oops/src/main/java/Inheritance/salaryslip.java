package Inheritance;

public class salaryslip extends hraandpf {

	public void displaytotalsalary()
	{
		double totalsalary = basicpay + hr - pf - deduction + bonus;
		
		System.out.println("Total salary in hand:" + totalsalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		salaryslip obj = new salaryslip();
		System.out.println("Total Salary:");
		obj.displaytotalsalary();
		obj.displaysalary();
		obj.displayhr();
		obj.displaypf();
		obj.displaytotalsalary();
		
	}

}
