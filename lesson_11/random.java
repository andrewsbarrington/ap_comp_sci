public class random
{
	public static void main(String[]args)
	{
		int[][] n = new int[4][4];
		int num = (int)(Math.random()*100)+1;
		for(int i = 0; i <n.length; i++)
		{
			for(int j = 0; j<n[i].length; j++)
			{
				n[i][j] = (int)(Math.random()*100)+1;
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