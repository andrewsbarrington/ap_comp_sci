import java.util.Scanner;
public class odds
{
	static int[] num = new int[10];
	public static void main(String[]args)
	{
			
		
	
		fillarray();
		printarray();
		getodds();
		
		
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
	public static void getodds()
	{
		System.out.println("\nOdd numebrs::  ");
		for(int v:num)
		{
			if(v % 2 == 1)
			{
			
				System.out.print(v + " ");
			}
			
		}
	
	}
}