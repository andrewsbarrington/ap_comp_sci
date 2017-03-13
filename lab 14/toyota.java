import java.util.*;
public class toyota implements location
{
	private double ex, why ;
	private int ID;
	
	


	public toyota(String l)
	{
		ArrayList<String> loc = new ArrayList<String>(Arrays.asList(l.split(", ")));
		double x = Double.parseDouble(loc.get(0));
		double y = Double.parseDouble(loc.get(1));
		move(x,y);
	}
	public void setID()
	{
		ID = (int)(Math.random()*1000000)+100000;
	}
	public int getID()
	{
		return ID;
	}
	public void move(double x, double y)
	{
		ex += x;
		why += y;
	}
	public double[] getloc()
	{
		double[] location = {ex, why};
		return location;
	}

}