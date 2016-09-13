import java.util.Scanner;


public class rudeAI
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("what is your name");
		String name = kb.next();
		System.out.println("name" + "why would anyone name there baby that");
		System.out.println("how old are you" + name);
		int num = kb.nextInt();
		System.out.println("oooooo!!!" + num + "is getting up there");
		System.out.println("what do you do for fun" + name );
		String hobby = kb.nextLine();
		kb.nextLine();
		System.out.println("i thought only nerds like" + hobby);
		System.out.println("what kind of music do you like");
		String music = kb.next();
		System.out.println("i heard" + music + "is cool");
		System.out.println(" how many siblings do you have");
		int nem = kb.nextInt();
		System.out.println("oh i see" + nem + "thats cool");
		System.out.println("what do you want to be when you grow up");
		String fueture = kb.nextLine();
		kb.nextLine();
		System.out.println("wow" + fueture + "thats amazing");
		
		
		
	}
	
	
}