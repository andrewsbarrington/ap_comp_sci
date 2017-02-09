public abstract class toy
{
	private String name;
	private int count;
	
	public toy()
	{
		this.name = "";
		this.count = 0;
	}
	public toy(String n)
	{
		this.name = n;
		this.count = 1;
	}
	public String getname()
	{
		return name;
		
	}
	public int getcount()
	{
		return count;
	}
	public void setname(String n)
	{
		this.name = n;
	}
	public void setcount(int c)
	{
		this.count = c;
	}
	public abstract String gettype();
	
	public String toString()
	{
		return name + " " + count;
	}
}