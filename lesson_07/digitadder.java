import java.util.Scanner;

public class digitadder
{
	static double sum = 0;
	static double num;
	static int number;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("please enter a number");
		number = kb.nextInt();
		
		sum();
		System.out.println("the sum of the digits in" + number + " is " + sum);
		
	}
	public static void sum()
	{
		while(number > 0)
		{
			 num = number % 10;
			number /= 10;
			sum += num;
		}
	}
}