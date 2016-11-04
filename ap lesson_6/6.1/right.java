import java.util.Scanner;
public class right
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter a word");
		String w = kb.next();
		for(int i=w.length()-1; 0<=i; i-- )
		{
			System.out.println(w.substring(i,w.length()));
		}
	}
}