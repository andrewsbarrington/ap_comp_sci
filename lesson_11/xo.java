public class xo
{
	public static void main(String[]args)
	{
		String[][] n = new String[4][4];
		
		for(int i = 0; i <n.length; i++)
		{
			for(int j = 0; j<n[i].length; j++)
			{
				int pick = (int)(Math.random()*2)+1;
				if(pick == 1)
				{
					n[i][j]= "x";
				}
				else
				{
					n[i][j]="o";
				}
			}
		}
		for(int i = 0; i <n.length; i++)
		{
			for(int j = 0; j<n[i].length; j++)
			{
				System.out.print(n[i][j] + "\t");
			}
			System.out.println();
		}
	}
}