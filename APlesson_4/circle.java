import java.util.Scanner;

public class circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("wht is the length");
		r = kb.nextDouble();
		calcarea();
		print();
		
	}
	public static void calcarea()
	{
		area = 3.14*(r*r);
	}
	public static void print()
	{
		System.out.printf("the area of a circle of radius" + r + "is %10.5f",area);
	}
}