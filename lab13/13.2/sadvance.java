public class sadvance extends advance
{
	public sadvance()
	{
		super();
	}
	public sadvance(int dl)
	{
		super(dl);
	}
	public double getprice()
	{
		return super.getprice()/2;
	}
	public String toString()
	{
		return super.toString() + "\n Student ID is requred";
	}
}