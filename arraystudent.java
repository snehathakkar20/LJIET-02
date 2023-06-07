package Assignments;
import java.util.*;

class data{
	int roll_no;
	String name;
	int marks;
	public void setdata(int roll_no,String name,int marks)
	{
		this.roll_no=roll_no;
		this.name=name;
		this.marks=marks;
	}
	public void show() {
		System.out.println("roll no= "+roll_no+" name= "+name+" marks= "+marks);
	}
}
public class arraystudent {
    public static void main(String[] args) {
    	
    	data[] d1=new data[5];
    	int count=0;
    	Scanner sc=new Scanner(System.in);
    	while(count<5)
    	{
    		System.out.println("enter roll");
    		int sroll=sc.nextInt();
    		System.out.println("enter name");
    		String sname=sc.next();
    		System.out.println("enter marks");
    		int smarks=sc.nextInt();
    		
    		d1[count]=new data();
    		d1[count].setdata(sroll,sname,smarks);
    		count++;
    	}
    	for(int i=0;i<d1.length;i++) {
    		d1[i].show();
    	}

    }
}
