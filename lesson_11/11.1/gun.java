import java.util.Scanner;
public class gun 
{
	static int bulletcount = 96;
	static int clipsize = 16;
	static int shotcount = 16;
	static String[] clip = new String[16];
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		while(bulletcount > 0 || shotcount > 0)
		{
			System.out.println("action?");
			String in = kb.next();
			if(in =="r")
			{
				reload();
			}
			else if(in == "s")
			{
				System.out.println(shoot());
			}
			printclip();
		}
	}
	public static void reset()
	{
		for(int i = 0; i<clipsize; i++)
		{
			clip[i] = "[]";
		}
	}
	public static String shoot()
	{
		if( shotcount > 0)
		{
			clip[shotcount-1] = "[]";
			shotcount--;
			return "boom";
		}
		else
		{
			return "reload";
		
		}
		
	}
	public static void reload()
	{
		if(bulletcount >= clipsize)
		{
			clipsize = clipsize - bulletcount;
			shotcount = clipsize;
		}
		else
		{
			shotcount = bulletcount;
			bulletcount = 0;
		}
		reset();
		for(int i = 0; i<shotcount;i++)
		{
			clip;
		}
	}
	public static void printclip()
	{
		String output= "";
		System.out.println("bullets" + "\t" + bulletcount+ "\n" + "clip" + "\t");
		for(int i = 0; i<clipsize;i++)
		{
			output = clip[i] + output;
			System.out.print(output);
		}
	}
}