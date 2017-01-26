public class car
{
	private String paint,engine,interior,tires;
	public car()
	{
		paint = "";
		engine = "";
		interior = "";
		tires = "";
	}
	public car(String p, String i ,String e ,String t)
	{
		paint = p;
		engine = e;
		tires = t;
		interior = i;
	}
	public void setvlaues()
	{
		paint = "";
		engine = "";
		tires = "";
		interior = "";
	}
	public String getpaint()
	{
		return paint;
	}
	public String getengine()
	{
		return engine;
	}
	public String gettires()
	{
		return tires;
	}
	public String getinterior()
	{
		return interior;
	}
}