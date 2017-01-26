import java.util.Scanner;

public class reversenum
{
	static double sum = 0;
	static double num;
	static int number;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("please enter a number");
		number = kb.nextInt();
		
		System.out.print(number);
		sum();
		System.out.println( " reversed is " + sum);
		
	}
	public static void sum()
	{
		while(number > 0)
		{
			sum = sum * 10;
			num = number % 10;
			number /= 10;
			sum += num;
		}
	}
}