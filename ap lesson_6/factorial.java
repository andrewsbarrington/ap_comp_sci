import java.util.Scanner;
public class factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter a number");
		int in = kb.nextInt();
		int factorial = 1;
		for(int i = 1; i <= in; i++)
		{
			double out = factorial*i;
			System.out.println(out);
		}
	}
}