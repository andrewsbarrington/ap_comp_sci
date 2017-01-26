import java.lang.Math;
public class userclass
{
	private String firstname, lastname, avatar;
	private int userid;
	public userclass()
	{
		lastname = "";
		firstname="";
		avatar = "";
		userid = 0;
	}
	public userclass(String fn, String ln)
	{
		firstname = fn;
		lastname = ln;
		avatar = "unidentified";
		userid = (int)(Math.random() * 1000000) +1;
	}
	public userclass(String fn,String ln, String av)
	{
		firstname = fn;
		lastname = ln;
		avatar = av;
		userid = (int)(Math.random()*1000000) +1;
	}
	public String toString()
	{
		return "customer info... \n first name:" +firstname + "\n lastname:" + lastname + " \n avatar" + avatar + " \n userid" + userid;
	}
}