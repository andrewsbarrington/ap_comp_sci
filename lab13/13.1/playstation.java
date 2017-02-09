public class playstation
{
	public playstation()
	{
		super();
	}
	public playstation(String p)
	{
		super(p);
	}
	public void setplatform(String p)
	{
		platform = p;
	}
	public void set serial();
	{
		serial# = random 7;
	}
	public int serial#()
	{
		return Serial#;
	}
	public String getplatform()
	{
		return platform;
	}
	public String getcontroller()
	{
		return "PS dualshock 3";
	}
	public static toString();
	{
		System.out.println("platform:" + platform + " \n" +"serial#" + serial# + "serial#" + " \ncontroller" + controller);
	}
}