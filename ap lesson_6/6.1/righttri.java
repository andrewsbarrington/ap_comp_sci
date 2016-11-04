import java.util.Scanner;
public class righttri
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter a number");
		String w = kb.next();
		
		for(int i=0; i <= w.length(); i++)
		{
			System.out.println(w.substring(i,w.length()));
		}
	}
}