import java.util.Scanner;
public class divisor
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int[][] n = new int[4][4];
		
		for(int i = 0; i <n.length; i++)
		{
			for(int j = 0; j<n[i].length; j++)
			{int num = (int)(Math.random()*100)+1;
				n[i][j] = num;
			}
		}
		for(int i = 0; i <n.length; i++)
		{
			for(int j = 0; j<n[i].length; j++)
			{
				System.out.print(n[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("please enter a number");
		int divisor = kb.nextInt();
		int count = 0;
		for(int i = 0; i <n.length; i++)
		{
			for(int j = 0; j<n[i].length; j++)
			{
				if (n[i][j] % divisor == 0)
				{
					count ++;
				}
				else
				{
					count += 0;
				}
			}
		}
		System.out.println("there are " + count + " numbers divisible by " + divisor + " in the Array");
	}
}