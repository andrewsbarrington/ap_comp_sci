import java.util.Scanner;
public class Strings
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[][] n = new String[4][4];
		
		for(int i = 0; i <n.length; i++)
		{
			for(int j = 0; j<n[i].length; j++)
			{ System.out.println("please enter a word");
				n[i][j] = kb.next();
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
	}
}