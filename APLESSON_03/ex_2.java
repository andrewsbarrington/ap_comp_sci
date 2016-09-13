import java.util.Scanner;



public class ex_2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println(" how much do you way");
		float w = kb.nextFloat();
		System.out.println("how tall are you");
		float h = kb.nextFloat();
		System.out.println(703*(w/(h*h)) + "is your BMI");
		
		
		
	}
	
	
	
}