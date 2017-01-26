import java.util.Scanner;
public class firstletter
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
		System.out.println("please enter five words");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		System.out.println("the first letter of every word is");
		first(words);
		System.out.println(" ");
	}
	public static void first(String[] n)
	{
		for(String word : n)
		{
			System.out.print(word.charAt(0) + "  ");
		}
	}
}