public class GMC implements location
{
	private double ex, why;
	private int ID;
	public GMC()
	{
		ex = 0;
		why = 0;
	}
	public GMC(int x,int y)
	{
		ex = x;
		why = y;
	}
	
	public void setID()
	{
		ID = (int)(Math.random()*1000000)+100000;
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
	public double getloc()
	{
		double[] location = new location[2];
		location[0] = ex;
		location[1] = why;
		return location;
	}
}