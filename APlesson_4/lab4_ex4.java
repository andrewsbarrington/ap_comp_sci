import java.util.Scanner;

public class lab4_ex4
{
	
	
	public static void main(String[]rags)
	{
		Scanner kb = new Scanner(System.in);
		
		lab4_ex4 cf = new lab4_ex4();
		
		System.out.print("what is the height of your speaker");
		double h = kb.nextDouble();
		
		System.out.println("what is the length of your speaker");
		double l = kb.nextDouble();
		
		System.out.println("what is the width of your speaker");
		double w = kb.nextDouble();
		
		double v = h*l*w;
		
		double result = cf.conv(v);
		
		System.out.println("the volumeof your speaker in cubic feet" + result);
		
	}
	public double conv(double v)
	{
		
		return (v/1728);
		
	}
	
}