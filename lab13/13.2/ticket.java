public abstract class ticket
{
	private int serialno;
	public ticket()
	{
		this.serialno = (int)(Math.random()*10000000)+1;
	}
	public int getserialno()
	{
		return serialno;
	}
	public abstract double getprice();
	public String toString()
	{
		return "serial#" + serialno + "\n price" + getprice();
	}
}