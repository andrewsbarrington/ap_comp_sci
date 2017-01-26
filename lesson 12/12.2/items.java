import java.util.Scanner;
public class items
{
	private String manufacurer, name, catagory;
	private int upc,price;
	public items()
	{
		manufacturer = "";
		name = "";
		catagory = "";
		upc = (int)(Math.random() *1000000000) + 1;
		price = 0;
	}
	public items(String mnf, String nm)
	{
		manufacturer = mnf;
		name = nm;
		upc = (int)(Math.random() *1000000000) + 1;
	}
	public items(String mnf, String nm, String ct, int p)
	{
		manufacturer = mnf;
		name = nm;
		catagory = ct;
		upc = (int)(Math.random() *1000000000) + 1;
		price = p;
	}
	public String toString()
	{
		return " item info \n" + manufacturer + " \n" + name + " \n" + catagory + " \n" + upc + "\n" + price; 
	}
	
	
	
		public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter the manufacturer and name");
		String mnf = kb.next();
		String nm = kb.next();
		System.out.println("will you entering catagory and price information");
		String ans = kb.next();
		if(ans .equals("no"));
		{
			items item = new items(mnf,nm);
		}
		else
		{
			System.out.println("please enter catagory and price");
			String ct = kb.next();
			Stirng p = kb.nextInt();
			items item = new items(mnf, nm, ct, p);
		}
		System.out.pritnln(item);
	}
}