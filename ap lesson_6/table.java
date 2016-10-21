import java.util.Scanner;
public class table
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter a number");
		int in = kb.nextInt();
		System.out.println("how big is the table");
		int table = kb.nextInt();
		
		for(double i = 1; i <= table; i++)
		{
			double x = i*in;
			System.out.printf("%.3f....%.3f\n",i,x);
		}
	}
}