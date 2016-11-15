import java.util.Scanner;
public class treedeg
{
	static String num;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter a word");
		num = kb.next();
		int stop = num.length();
		int start = 0;
		System.out.println(replace(num, stop, start));
		
	}
	public static String replace(String num, int stop, int start)
	{
		if (start<=stop)
		{
			System.out.println(num.substring(0,start));
			start+=1;
			replace(num, stop, start);
			
		}
		return "";
		
	}
}