public class honda extends car
{
	private double ex, why;
	private int ID;
	public honda()
	{
		
		ex = 0;
		why = 0;
	}
	public honda(double[] l)
	{
		ID = (int)(Math.random()*1000000)+1;
		ex = l[0];
		why = l[1];
	}
	public int getID()
	{
		return ID;
	}
	public void move(double x,double y)
	{
		ex += x;
		why += y;
	}
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = ex;
		location[1] = why;
		return location;
	}
}