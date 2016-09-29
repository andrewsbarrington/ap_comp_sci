import java.util.Scanner;

public class cube
{
	
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("wht is the length");
		side = kb.nextDouble();
		calcsa();
		print();
		
	}
	public static void calcsa()
	{
		sa = 6*(side*side);
		
	}
	public static void print()
	{
		System.out.printf("the surface area of your cube is:: %10.5f", sa);
	}
}
	