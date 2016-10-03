import java.util.Scanner;

public class rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("wht is the length");
		l = kb.nextDouble();
		
		System.out.println("what is the width");
		w = kb.nextDouble();
		calc();
		print();
		
	}
	public static void calc()
	{
		
		 perimeter = (w*l);
		
	}
	public static void print()
	{
		System.out.printf("your rectangle is: %10.5f",perimeter ,"is the perimeter");
		
	}
	
}