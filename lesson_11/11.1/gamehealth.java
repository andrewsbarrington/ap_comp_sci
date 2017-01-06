import java.util.Scanner;

public class gamehealth
{
	static String[] health;
	static int healthl = 6;
	static int healthcount = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0 ;
		healthcount = 6;
		
		
		while (!(turn.equals("q")) && healthcount > 0)
		{
			System.out.println("what you gonna do BOI");
			turn = kb.next();
			damage = (int)(Math.random()*2)+1;
			amount = (int)(Math.random()*6)+1;
		
			System.out.println(takedamage(damage,amount));
			health = new String[healthl];
			System.out.println(printclip(damage,amount));
			System.out.println(healthcount);
		}
		System.out.println("you ded:(");
		
	}
	public static String takedamage(int d,int a)
	{
		if(d == 1)
		{
			healthcount = healthcount - a;
			return "taking " + a + "damage";
		}
		else
		{
			if(healthcount + a < healthl)
			{
				healthcount = healthcount + a;
				
			}
			else
			{
				healthcount = healthl;
			}
			return "power up " + a;
		}
	}
	public static String printclip(int d, int a)
	{
		String output = "health" + "	";
		for(int i = 0; i<healthl;i++)
		{
			if(i < healthcount)
			{
				health[i] = "@";
			}
			else
			{
				health[i] = "[]";
				
			}
			output = output + health[i];
		}
		return output;
	}
}