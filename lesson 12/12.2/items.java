public class items
{
	private String manufacurer, name catagory;
	private int upc,price;
	public items()
	{
		manufacturer = "";
		name = "";
		catagory = "";
		upc = (int)(Math.random() *1000000000) + 1;
		price = 0;
	}
	public item(String mnf, String nm)
	{
		manufacturer = mnf;
		name = nm;
		upc = (int)(Math.random() *1000000000) + 1;
	}
	public item(String mnf, String nm, String ct, int p)
	{
		manufacturer = mnf;
		name = nm;
		catagory = ct;
		upc = (int)(Math.random() *1000000000) + 1;
		price = p;
	}
	public String toString()
	{
		return " item info \n" + manufacturer + " \n" + name + " \n" + catagory + " \n" + upc + "\n" + price; 
	}
}