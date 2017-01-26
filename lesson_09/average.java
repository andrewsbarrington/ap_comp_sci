simport java.util.Scanner;
public class average
{
	static int sum;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int[] words = new int[10];
		
		for(int i = 0; i < 10; i++)
		{
			words[i] = (int)(Math.random()*100);
		}
		for(int n : words)
		{
			System.out.println(n);
		}
		for(int n : words)
		{
			System.out.print(n + " ");
		}
		System.out.println("\nthe average of the above numbers is " + average(words));
	}
	public static double average(int[] n)
	{
		for(int word : n)
		{
			sum += word;
		}
		return sum/10;
	}
}