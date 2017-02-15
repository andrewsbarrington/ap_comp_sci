public class gamerunner
{
	public static void main(String[]args)
	{
		gamesystem ya = new pcclass("PC");
		gamesystem oh = new playstation("PS4");
		gamesystem no = new xbox("xbox");
		System.out.println(oh);
		System.out.println(no);
		System.out.println(ya);
	}
}