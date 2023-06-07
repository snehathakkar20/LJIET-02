package Assignments;
import java.util.*;
public class employee {
	int emp;
	static int count;
	 
	
	public employee(int emp) {
	
		this.emp = emp;
		count ++;
		
	}
	
	public static int show() {
		return count;
	}


	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employees you want to add");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
			
			System.out.println("enter emplyee "+(i+1));
			int id=sc.nextInt();
			employee empo=new employee(id);
		}
		System.out.println("number of employees = "+employee.show());
		
		
	}

}
