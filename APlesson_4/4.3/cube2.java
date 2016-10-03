import java.util.Scanner;

public class cube2
{
	
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("wht is the length");
		side = kb.nextDouble();
		
		print();
		
	}
	public static double calcsa()
	{
		return 6*(side*side);
		
	}
	public static void print()
	{
		System.out.printf("the surface area of your cube is:: %10.5f", calcsa());
	}
}
	