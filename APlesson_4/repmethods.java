public class repmethods
{
	
	
	
	public static void main(String[]args)
	{
		repmethods average = new repmethods();
		int n1 = 3;
		int n2 = 8;
		int n3 = 15;
		double avg = average.calcavg(n1,n2,n3);
		System.out.printf("the volume of your cube is %10.2f\n", avg);
		
		}
		
		public double calcavg(int one,int two,int three)
		{
			
			return (one*two*three)/3.0;
		}
		
}


