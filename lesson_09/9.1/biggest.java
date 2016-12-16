import java.util.Scanner;
public class biggest
{
	static int[] num = new int[10];
	public static void main(String[]args)
	{
			
		
	
		fillarray();
		printarray();
		System.out.println(getodds());
		
		
	}
	public static void fillarray()
	{
		for(int i = 0; i < 10; i++)
		{
			num[i] =  1 + (int)(Math.random()*100);
		}
	}
	public static void printarray()
	{
		System.out.println("All numebrs::  ");
		for(int x:num)
		{
			System.out.print(x + " ");
		}
	}
	public static int getodds()
	{
		int max = 0;
		System.out.println("\nbiggest numebrs::  ");
		for(int v:num)
		{
			if(v > max)
			{
			
				max = v;
			}
			
		}
	return max;
	}
}