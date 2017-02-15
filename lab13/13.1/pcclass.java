public class pcclass extends gamesystem
{
	public pcclass()
	{
		super();
	}
	public pcclass(String p)
	{
		super(p);
	}

	public String getsysteminput()
	{
		return "keyboard and mouse";
	}
	public String getplatform()
	{
		return "PCMR";
	}
	
	public String toString()
	{
		return ("platform:" + getplatform() + " \n" +"serial#" + super.getserialn() + "" + " \ncontroller" + getsysteminput());
	}
}