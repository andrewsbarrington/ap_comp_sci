public class honda implements location
{
	private double ex, why;
	private ID;
	public honda()
	{
		ex = 0;
		why = 0;
	}
	public honda(double[] l)
	{
		ex = l[0];
		why = l[1];
	}
	public int getID()
	{
		return (int)(Math.random()*1000000)+1;
	}
	public static move(double x, double y)
	{
		ex += x;
		why += y;
	}
	public int location()
	{
		double[] location = new double[2];
		location[0] = ex;
		location[1] = why;
		return location;
	}
}