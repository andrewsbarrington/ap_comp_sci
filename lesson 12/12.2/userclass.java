import java.util.Scanner;
import java.lang.Math;
public class userclass
{
	private String firstname, lastname, avatar;
	private int userid;
	public userclass()
	{
		lastname = "";
		firstname="";
		avatar = "";
		userid = 0;
	}
	public userclass(String fn, String ln)
	{
		firstname = fn;
		lastname = ln;
		avatar = "unidentified";
		userid = (int)(Math.random() * 1000000) +1;
	}
	public userclass(String fn,String ln, String av)
	{
		firstname = fn;
		lastname = ln;
		avatar = av;
		userid = (int)(Math.random()*1000000) +1;
	}
	public String toString()
	{
		return "customer info... \n first name:" +firstname + "\n lastname:" + lastname + " \n avatar" + avatar + " \n userid" + userid;
	}
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