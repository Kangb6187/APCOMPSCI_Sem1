import java.util.Scanner;
public class Lab_Circle
{
	static double r;
	static double area;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the length of the radius of the circle?");
		r = kb.nextDouble();
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		area = r*r*3.1415926535;
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of " + r + " is %.5f" + ".", area);
	}
}	