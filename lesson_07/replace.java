import java.util.Scanner;
public class replace
{
	static int sentence = 0;
	static String word = "";
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter a sentence");
		word = kb.next();
		replace();
		
	
	}
	public static void replace()
	{
		
		while(word.indexOf("a") >= 0)
		{
			sentence = word.indexOf("a");
			word = (word.substring(0,sentence) + "@" + word.substring(sentence + 1));
		}
		System.out.println(word);
		
	}
}