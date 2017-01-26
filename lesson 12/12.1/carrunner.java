import java.util.Scanner;
public class carrunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("make your own car");
		System.out.println("paint color?");
		String paint = kb.next();
		System.out.println("interior?");
		String interior = kb.next();
		System.out.println("engine?");
		String engine = kb.next();
		System.out.println("tires?");
		String tires = kb.next();
		
		car object = new car(paint,interior,engine, tires);
		System.out.println("your car is ready........\n" + "paint: \t" + object.getpaint());
		System.out.println("interior: \t" + object.getinterior());
		System.out.println("Engine: \t" + object.getengine());
		System.out.println("Tires: \t" + object.gettires());
		
	}


	
}s