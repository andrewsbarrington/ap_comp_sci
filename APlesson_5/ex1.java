import java.util.Random;

public class ex1
{
	
	public static void main(String[]args)
	{
		Random rand = new Random();
		int pl = rand.nextInt(6)+1;
		int co = rand.nextInt(6)+1;
		String w = roll(co,pl);
		System.out.println("you rolled a" + pl);
		System.out.println("the computer rolled a" + co);
		System.out.println("the winner is " + w);
		
	}
	
	public static String roll(int pl, int co)
	{
		String winner = "";
		if (pl>co)
			 winner = "you";
		if (pl<co)
			 winner = "computer";
		
		return winner;
		
	}
}