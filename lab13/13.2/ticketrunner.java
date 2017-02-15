public class ticketrunner
{
	public static void main(String[]args)
	{
		ticket one = new walkup();
		ticket two = new advance(20);
		ticket three = new sadvance(5);
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}
}