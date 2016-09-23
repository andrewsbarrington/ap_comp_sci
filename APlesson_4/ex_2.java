import java.util.Scanner;

public class ex_2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		ex_2 form = new ex_2();
		
		System.out.println("enter your first name");
		String word2 = kb.next();
		
		System.out.println("enter your last name");
		String info2 = kb.next();
		
		System.out.println("enter your title");
		String word3 = kb.next();
		kb.nextLine();
		System.out.println("enter the school site");
		String word1 = kb.nextLine();
		
		System.out.println("enter the school year");
		String info1 = kb.next();
		kb.nextLine();
		System.out.println("what is your subject");
		String info3 = kb.nextLine();
		 
		
		 
		System.out.println("********************************");
		form.format(word1, info1);
		form.format(word2, info2);
		form.format(word3, info3);
		System.out.println("********************************");
		
		
		
		
	}
	
	public void format(String word, String info)
	{
		System.out.printf("*%10s       %10s*\n", word, info);
		
	}
	
	
}