import java.util.Scanner;
public class lucky
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter a number");
		int num = kb.nextInt();
		System.out.println(replace(num));
		
	}
	public static int replace(int num)
	{
		if (num > 0)
		{
			 if (num % 10 == 7)
			 {
				 return 1+ replace(num/10);
			 }
			 else
			 {
				 return 0 + replace(num/10);
			 }
			
		}
		else
		{
		 return 0;
			
		}
		
	}
}