import java.util.Scanner;

public class average
{
	static int num1;
	static int num2;
	static int num3;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("what is your first number");
		num1 = kb.nextInt();
		
		System.out.println("what is your second number");
		num2 = kb.nextInt();
		
		System.out.println("what is your third number");
		num3 = kb.nextInt();
		calc();
		print();
	
		
	}
	public static void calc()
	{
	 avg = (num1+num2+num3)/3;
	}
	public static void print()
	{
		System.out.printf("the average of " + num1 + num2 + num3 + "is :: %10.5f",avg );
		
	}
}