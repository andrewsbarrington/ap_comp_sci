import java.util.Scanner;

public class rectangle2
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
		
		print();
		
	}
	public static double calc()
	{
		
		 return(w*l);
		
	}
	public static void print()
	{
		System.out.printf("your rectangle is: %10.5f",calc() ,"is the perimeter");
		
	}
	
}