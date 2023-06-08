package Assignments;

class register{
	register(){
		System.out.println("student register process!");
	}
	register(String name) {
		System.out.println("name is "+name);
	}
	register(String add,int phone)
	{
		System.out.println("your add is "+add);
		System.out.println("phone number is "+phone);
	}
	register(int adhar,int parentphone) {
		System.out.println("your adhar number is "+adhar);
		System.out.println("parent phonenumber is "+parentphone);
	}
}
public class student_inclass {
	public static void main(String args[])
	{
		register si1=new register();
		register si2= new register("sneha");
		register si3=new register("paris",123456789);
		register si4=new register(85274196,987654321);
	}
	
}
