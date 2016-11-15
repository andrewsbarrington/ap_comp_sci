import java.util.Scanner;
public class underscores
{
	static String num;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter a sentence");
		num = kb.nextLine();
		System.out.println(replace());
		
	}
	public static String replace()
	{
		if (num.indexOf(" ") < 0)
		{
			 return num;
			
		}
		else
		{
		 num = (num.substring(0,num.indexOf(" ")) + "_" + num.substring(num.indexOf(" ") + 1));
			return replace();
			
		}
		
	}
}