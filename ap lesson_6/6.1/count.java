import java.util.Scanner;
public class count
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please chooose ae number to count to");
		int count = kb.nextInt();
		
		System.out.println("what woulf you like to count by");
		int by = kb.nextInt();
		for( int i=0; i<= count; i += by)
		{
			System.out.print(i+"\t");
		}
	}
}