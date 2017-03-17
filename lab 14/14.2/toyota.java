import java.util.*;
public class toyota extends car
{
	public toyota(String l)
	{
		super();
		ID = (int)(Math.random()*1000000)+1;
		ArrayList<String> loc = new ArrayList<String>(Arrays.asList(l.split(", ")));
		double x = Double.parseDouble(loc.get(0));
		double y = Double.parseDouble(loc.get(1));
		super.move(x,y);
	}

}