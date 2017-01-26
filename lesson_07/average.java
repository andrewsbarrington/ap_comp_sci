import java.util.Scanner;
public class average
{
	static int number;
	static int digits = 0;
	static int sum = 0;
	static double num;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter a number");
		number = kb.nextInt();
		System.out.print("the average of the digits in " + number);
		avdigits();
		double average = sum/digits;
		System.out.print(" is " + average + " \n");
	}
	public static void avdigits()
	{
		while(number > 0)
		{
			digits ++;
			 num = number % 10;
			number /= 10;
			sum += num;
			
		}
		double average = sum/digits;
	}
}