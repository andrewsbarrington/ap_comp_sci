import java.util.Scanner;
public class mphrunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter a distance, hour, and minutes");
		int d = kb.nextInt();
		int m = kb.nextInt();
		int h = kb.nextInt();
		milesperhour object = new milesperhour(d, h, m);
		
		System.out.println(d + " miles in " + h + " hours = " + object.getmph(d,h,m));
		System.out.println(d + " " + h + " " + m);
		object.setvalues(d,h,m);
		
	}
}