public class GMC extends car
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
		ID = (int)(Math.random()*1000000)+1;
		ex = x;
		why = y;
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