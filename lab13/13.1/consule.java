public abstract class consule extends gamesystem
{

	public consule()
	{
		super();
	}
	public consule(String p)
	{
		super(p);
	}

	public abstract String getcontroller();
	public String toString()
	{
		return ("platform:" + super.getplatform() + " \n" +"serial#" + super.getserialn() + "" + " \ncontroller" + getcontroller());
	}
}