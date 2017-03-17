public abstract class car implements Location  
{
	private double[] Location = new double[2];
	private final int ID = (int)(Math.random()*1000000);
	public car()
	{
		
	}

	public int getID()
	{
		return ID;
	}
	public void move(double x, double y)
	{
		Location[0] += x;
		Location[1] += y;
	}
	public double[] getLoc()
	{
		return Location;
	}

	
}