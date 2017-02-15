
public abstract class gamesystem
{
	String platform;
	int serialn;
	public gamesystem()
	{
		platform = "";
		serialn = (int)((Math.random()*10000000)+1);
	}
	public gamesystem(String p)
	{
		platform = p;
		serialn = (int)((Math.random()*10000000)+1);
	}
	public int getserialn()
	{
		return serialn;
	}
	public String getplatform()
	{
		return platform;
	}
}