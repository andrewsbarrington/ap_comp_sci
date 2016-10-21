import java.util.Scanner;

public class pass
{
static Scanner kb;


public static void main(String[]args)
{
	kb = new Scanner(System.in);
	String username = "andrew";
	String password = "boi";
	pass();
	
}

public static void pass()
{
	System.out.println("please enter your user name");
	String useren = kb.next();
	System.out.println("please enter your password");
	String pasen = kb.next();
	
	if (useren.equals("andrew")&&pasen.equals("boi"))
	{
			System.out.println("access granted");
		
	}
	else 
	{
		if(useren.equals("andrew"))
		{
		System.out.println("your password is incorrect");
		pass();
		}
		else if (pasen.equals("boi"))
		{
			System.out.println("your username is incorrect");
			pass();
		}
		else{
			System.out.println("username and password are incorrect");
			pass)();
		}
	}
	
	
}
}