import java.util.Scanner;
public class hreunner
{
	public static void main(String[]args)
	{
		String x = "red";
		String z = "blue";
		String y = "white";
		Scanner kb = new Scanner(System.in);
		System.out.println("create your own person");
		System.out.println("please choose eye color");
		String eyes = kb.next();
		System.out.println("please choose hair");
		String hair = kb.next();
		System.out.println("please choose skin color");
		String skin = kb.next();
		
		human object = new human(x,z,y);
		System.out.println("my info...");
		System.out.println("hiar:\t" + object.gethair());
		System.out.println("eyes:\t" + object.geteyes());
		System.out.println("skin:\t" + object.getskin());
		object.setHES(hair,eyes,skin);
		System.out.println("freinds info...");
		System.out.println("hair:\t" + object.gethair());
		System.out.println("eyes:\t" + object.geteyes());
		System.out.println("skin:\t" + object.getskin());
	}
}