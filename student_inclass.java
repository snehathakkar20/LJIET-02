package Assignments;

class register{
	public void reg(String name) {
		System.out.println("name is "+name);
	}
	public void reg(String add,int phone)
	{
		System.out.println("your add is "+add);
		System.out.println("phone number is "+phone);
	}
	public void reg(int adhar,int parentphone) {
		System.out.println("your adhar number is "+adhar);
		System.out.println("parent phonenumber is "+parentphone);
	}
}
public class student_inclass {
	public static void main(String args[])
	{
		register si1=new register();
		si1.reg("sneha");
		si1.reg("paris",123456789);
		si1.reg(85274196,987654321);
	}
	
}
