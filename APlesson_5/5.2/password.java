import java.util.Scanner;

public class password
{
static Scanner kb;


public static void main(String[]args)
{
	kb = new Scanner(System.in);
	String username = "andrew";
	String password = "boi";
	check(username, password);
	
}

public static void check(String one, String two);
{
	System.out.println("please enter your user name");
	String useren = kb.next();
	System.out.println("please enter your password");
	String pasen = kb.next();
	
	if (useren.equals("andrew"))
	{
		if (pasen.equals("boi"))
		{
			System.out.println("access granted");
		}
		else
		{
			System.out.prinln("your password is incorrect");
		}
	}
	else 
	{
		System.out.println("your username is incorrect");
	}
	
	
}
}