import java.util.Scanner;
public class triangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter a word");
		String word = kb.next();
		for(int i = word.length(); 0<= i; i--)
		{
			System.out.println(word.substring(0,i));
			
		}
	}
}