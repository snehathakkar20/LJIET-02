package training;
import java.util.Scanner;

public class Circle {
	double radius;
	double area;
	double circ;
	final double pi=3.14;
	public void setR() {
		System.out.println("enter radius");
		Scanner s= new Scanner(System.in);
		radius = s.nextDouble();
		
	}
	public void getR() {
		System.out.println("entered radius is = "+ radius);
		area = radius*radius*pi;
		System.out.println("area of circle is = "+area);
		circ = 2*radius*pi;
		System.out.println("circumference of circle is = "+circ);
	}
	public static void main(String args[]) {
		Circle c1= new Circle();
		c1.setR();
		c1.getR();
	}

}
