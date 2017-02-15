public class advance extends ticket
{
	public int daysl;
	public advance()
	{
		super();
	}
	public advance(int dl)
	{
		daysl = dl;
	}
	public double getprice()
	{
		if (daysl > 10)
		{
			return 30.00;
		}
		else
		{
			return 40.00;
		}
	}
}