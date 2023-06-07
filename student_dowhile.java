package Assignments;
import java.util.*;



class data1{
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
public class student_dowhile {
    public static void main(String[] args) {
    	
    	data1[] d1=new data1[5];
    	int count=0;
    	do {
    		Scanner sc=new Scanner(System.in);
    		System.out.println("enter roll");
    		int sroll=sc.nextInt();
    		System.out.println("enter name");
    		String sname=sc.next();
    		System.out.println("enter marks");
    		int smarks=sc.nextInt();
    		
    		d1[count]=new data1();
    		d1[count].setdata(sroll,sname,smarks);
    		count++;
    	}while(count<5);
    	
    	
    	
    		
    	
    	for(int i=0;i<d1.length;i++) {
    		d1[i].show();
    	}

    }
}
