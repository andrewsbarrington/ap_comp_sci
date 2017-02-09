import java.util.Scanner;
public class toyrunner
{
	public static void main (String[]args)
	{
		String toy = "Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF";
		toystore store = new toystore(toy);
		System.out.println(store);
		System.out.println(store.getmosttoy());
		System.out.println(store.getmosttype());
	}
}