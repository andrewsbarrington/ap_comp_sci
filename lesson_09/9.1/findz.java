import java.util.Scanner;
public class findz
{
	static String[] num = new String[5];
	public static void main(String[]args)
	{
			
		
	
		fillarray();
		printarray();
		System.out.println(getodds() + " ");
		
		
	}
	public static void fillarray()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter 5 words");
		for(int i = 0; i < 5; i++)
		{
			num[i] =  kb.next();
		}
	}
	public static void printarray()
	{
		System.out.println("All words::  ");
		for(String x:num)
		{
			System.out.print(x + " ");
		}
	}
	public static String getodds()
	{
		String z = "";
		System.out.println("\nwords with zs::  ");
		for(String v:num)
		{
			if(v.indexOf("z") >= 0 || v.indexOf("Z") >= 0)
			{
			z = z+v + " ";
			}
			
		}
	return z;
	}
}