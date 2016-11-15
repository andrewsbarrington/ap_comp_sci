import java.util.Scanner;
public class center
{
	static String num1;
	static String num2;
	static String num3;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter a word");
		 num1 = kb.next();
		System.out.println("please enter a word");
		 num2 = kb.next();
		System.out.println("please enter a word");
		 num3 = kb.next();
		System.out.println(replace(num1));
		System.out.println(replace(num2));
		System.out.println(replace(num3));
	}
	public static String replace(String word)
	{
		if (word.length() >= 20)
		{
			 return word;
			
		}
		else
		{
		 word = (" " + word + " ");
			return replace(word);
			
		}
		
	}
}