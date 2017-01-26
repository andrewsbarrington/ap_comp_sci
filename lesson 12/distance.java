import java.lang.Math.*;
public class distance
{
	private int x1, y1, x2, y2;
	private double d;
	
	public distance()
	{
		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;
		d = 0;
	}
	public distance(int xone , int xtwo , int yone, int ytwo)
	{
		x1 = xone;
		x2 = xtwo;
		y1 = yone;
		y2 = ytwo;
		d = 0;
	}
	public void setvalues()
	{
		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;
	}
	public double getdist()
	{
		d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		return d;
	}
}