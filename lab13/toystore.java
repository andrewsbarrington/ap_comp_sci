import java.util.*;
public class toystore
{
	
	ArrayList<toy> inventory;
	public toystore()
	{
		inventory = new ArrayList<toy>();
	}
	public toystore(String toy)
	{
		loadtoys(toy);
	}
	public void loadtoys(String toyz)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(toyz.split(", ")));
		inventory = new ArrayList<toy>();
		
		for(int i = 0; i<toys.size();i += 2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			toy t = getthattoy(name);
			if(t == null)
			{
				if(type.equalsIgnoreCase("car"))
				{
					inventory.add(new car(name));
				}
				if(type.equalsIgnoreCase("af"))
				{
					inventory.add(new afigure(name));
				}
			}
			else
			{
				t.setcount(t.getcount()+1);
			}
		}
	}
	
	public toy getthattoy(String name)
	{
		for (toy t : inventory)
		{
			if (t.getname().equalsIgnoreCase(name))
			{
				return t;
			}
		}
		return null;
	}
	public String getmosttoy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(toy t: inventory)
		{
			if(max < t.getcount())
			{
				max = t.getcount();
				name = t.getname();
			}
		}
		return name;
	}
	public String getmosttype()
	{
		int x=0;
		int y = 0;
		for(toy b : inventory)
		{
			if(b.gettype().equalsIgnoreCase("car"))
			{
				x++;
			}
			else if(b.gettype().equalsIgnoreCase("afigure"))

			{
				y ++;
			}
		}
		if(x<y)
		{
			return "car";
			
		}
		else 
		{
			return "action figure";
		}
	}
	
		
	public String toString()
	{
			return "" + inventory;
	}

}