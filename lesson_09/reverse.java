import java.util.Scanner;
public class reverse
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println(" please enter five words");
		String[] kek = new String[5];
		for(int i = 0; i < kek.length; i++)
		{
			kek[i] = kb.next();
		}	
		for(String name : kek)
		{
			System.out.print(name + "  ");
		}
		System.out.println("\n reversed");
		
		abcd(kek);
		System.out.println(" ");
	}
	public static void abcd(String[] n)
	{
		for(int i = n.length - 1; i >= 0; i--)
		{
			System.out.print( n[i] + "  ");
		}

		
	}
}