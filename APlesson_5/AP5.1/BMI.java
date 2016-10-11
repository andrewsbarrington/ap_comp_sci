import java.util.Scanner;
public class BMI
{
	static double bmi;
	static String condition;
	static double height;
	static double weight;
	
	
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("what is your height");
		height = kb.nextInt();
		System.out.println("what is your weight");
		weight = kb.nextInt();
		calcbmi();
		System.out.printf("your bmi is %2.3f" , bmi);
		System.out.println("\nyou are " + condition);
	}
	public static void calcbmi()
	{
		bmi = (weight * 703)/(height*height);
		if (bmi<18.5)
		{condition = "under weight";}
	else if (bmi<24.9)
	{condition = "normal";}
else if (bmi<29.9)
{condition = "overweight";}
else if (bmi<34.9)
{condition = "obese";}
else if (bmi<39.9)
{condition = "very obese";}
else
{condition = "morbidly obese";}
	}
}