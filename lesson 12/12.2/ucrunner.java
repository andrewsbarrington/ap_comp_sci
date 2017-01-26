import java.util.Scanner;
public class ucrunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter your first name and last name");
		String fn = kb.next();
		String ln = kb.next();
		System.out.println("do you wat a user avatar, answer with y or n");
		String ans = kb.next();
		user1 = new userclass();
		if(ans.equals("n"))
		{
			userclass user1 = new userclass(fn,ln);
		}
		else
		{
			System.out.println("please enter an avatar name");
			String av = kb.next();
			userclass user1 = new userclass(fn,ln,av);
		}
		System.out.println(user1);
	}
}