import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class composites
{ 
	static Integer [] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
	static ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
	public static void main(String[]args)
	{
		Integer [] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
		System.out.println(nums);
		remove(nums);
		System.out.println(nums);

	}
	public static int gfactor(int n)
	{
		
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				return 1;
			}
		}
		return 0;
	}
	public static void remove(ArrayList<Integer> nums)
	{
	
		for(int i = 0; i < nums.size() ; i++)
		{
			if(gfactor(nums.get(i))==0)
			{
				nums.remove(i);
				i=i-1;
			}
		}
		
	}
}