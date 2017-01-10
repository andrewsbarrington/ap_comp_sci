import java.lang.Math;


public class milesperhour
{
	private int d, h, m;
	
	private double mph ;
	
	public milesperhour()
	{
		d = 0;
		m = 0;
		h = 0;
		mph = 0;
	}
	public milesperhour(int d, int m, int h)
	{
		mph =0;
	}
	public void setvalues(int h, int m, int d)
	{
		mph = 0;
	}
	public double getmph(int d,int h, int m)
	{
		mph = Math.round(d/(h+m/60));
		return mph;
	}

}
