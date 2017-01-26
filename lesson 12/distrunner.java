import java.util.Scanner;
public class distrunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("make the x and y values for two points");
		int x1 = kb.nextInt();
		int x2 = kb.nextInt();
		int y1 = kb.nextInt();
		int y2 = kb.nextInt();
		distance object = new distance(x1,x2,y1,y2);
		System.out.println("distance =" + object.getdist());
		object.setvalues();
	}
}